package cn.devzyh.smallspring.beans.factory.config;

import cn.devzyh.smallspring.beans.BeansException;

public interface BeanFactoryPostProcessor {

    /**
     * 在所有BeanDefinition加载完成，实例化之前的属性修改方法
     *
     * @param factory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableBeanFactory factory) throws BeansException;
}
