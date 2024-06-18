package cn.devzyh.smallspring.beans.factory.support;

import cn.devzyh.smallspring.beans.factory.config.BeanDefinition;

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

    /**
     * 是否存在Bean
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

}
