package cn.devzyh.minispring.beans.factory.support;

import cn.devzyh.minispring.beans.BeanException;
import cn.devzyh.minispring.beans.factory.config.BeanDefinition;

/**
 * 实现Bean实例化的模板方法
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (Exception e) {
            throw new BeanException("实例化Bean对象失败");
        }

        addSingleton(beanName, bean);
        return bean;
    }
}
