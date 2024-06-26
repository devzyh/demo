package cn.devzyh.smallspring.beans.factory.support;

import cn.devzyh.smallspring.beans.BeansException;
import cn.devzyh.smallspring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 对象实例化策略接口
 */
public interface InstantiationStrategy {

    /**
     * 实例化对象
     *
     * @param beanDefinition
     * @param constructor
     * @param args
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, Constructor<?> constructor, Object[] args) throws BeansException;

}
