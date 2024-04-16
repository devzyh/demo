package cn.devzyh.minispring.beans.factory.support;

import cn.devzyh.minispring.beans.BeanException;
import cn.devzyh.minispring.beans.factory.BeanFactory;
import cn.devzyh.minispring.beans.factory.config.BeanDefinition;

/**
 * Bean工厂模板方法
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) throws BeanException {
        // 优先获取单例对象
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition);
    }

    /**
     * 获取Bean定义
     *
     * @param beanName
     * @return
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeanException;

    /**
     * 创建Bean对象
     *
     * @param beanName
     * @param beanDefinition
     * @return
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException;

}

