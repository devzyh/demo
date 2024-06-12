package cn.devzyh.minispring.beans.factory.support;

import cn.devzyh.minispring.beans.BeanException;
import cn.devzyh.minispring.beans.PropertyValue;
import cn.devzyh.minispring.beans.PropertyValues;
import cn.devzyh.minispring.beans.factory.config.BeanDefinition;
import cn.devzyh.minispring.beans.factory.config.BeanReference;
import cn.hutool.core.bean.BeanUtil;

import java.lang.reflect.Constructor;

/**
 * 实现Bean实例化的模板方法
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    private static final InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeanException {
        Object bean = null;
        try {
            Constructor<?> constructor = null;
            for (Constructor<?> c : beanDefinition.getBeanClass().getConstructors()) {
                if (args != null && c.getParameterTypes().length == args.length) {
                    constructor = c;
                    break;
                }
            }

            bean = instantiationStrategy.instantiate(beanDefinition, constructor, args);

            applyPropertyValues(bean, beanDefinition);
        } catch (Exception e) {
            throw new BeanException("实例化Bean对象失败");
        }

        addSingleton(beanName, bean);
        return bean;
    }

    /**
     * 请求属性对象
     *
     * @param bean
     * @param beanDefinition
     */
    void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws BeanException {
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        try {
            for (PropertyValue pv : propertyValues.getPropertyValues()) {
                String name = pv.getName();
                Object value = pv.getValue();

                // 获取依赖Bean对象
                if (value instanceof BeanReference) {
                    value = getBean(((BeanReference) value).getBeanName());
                }

                // 对象赋值
                BeanUtil.setFieldValue(bean, name, value);
            }
        } catch (BeanException e) {
            throw new BeanException("请求属性对象失败");
        }
    }

}
