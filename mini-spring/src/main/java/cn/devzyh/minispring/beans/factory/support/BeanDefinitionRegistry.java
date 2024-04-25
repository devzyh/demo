package cn.devzyh.minispring.beans.factory.support;

import cn.devzyh.minispring.beans.factory.config.BeanDefinition;

/**
 * Bean定义注册接口
 */
public interface BeanDefinitionRegistry {

    /**
     * 注册Bean定义
     *
     * @param beanName
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
