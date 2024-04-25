package cn.devzyh.minispring.beans.factory.support;

import cn.devzyh.minispring.beans.BeanException;
import cn.devzyh.minispring.beans.factory.config.BeanDefinition;

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
        } catch (Exception e) {
            throw new BeanException("实例化Bean对象失败");
        }

        addSingleton(beanName, bean);
        return bean;
    }

}
