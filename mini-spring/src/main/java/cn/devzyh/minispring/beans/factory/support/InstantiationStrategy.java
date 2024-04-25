package cn.devzyh.minispring.beans.factory.support;

import cn.devzyh.minispring.beans.BeanException;
import cn.devzyh.minispring.beans.factory.config.BeanDefinition;

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
     * @throws BeanException
     */
    Object instantiate(BeanDefinition beanDefinition, Constructor<?> constructor, Object[] args) throws BeanException;

}
