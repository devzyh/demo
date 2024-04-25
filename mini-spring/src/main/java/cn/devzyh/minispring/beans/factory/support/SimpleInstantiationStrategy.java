package cn.devzyh.minispring.beans.factory.support;

import cn.devzyh.minispring.beans.BeanException;
import cn.devzyh.minispring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Java实例化对象
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

    @Override
    public Object instantiate(BeanDefinition beanDefinition, Constructor<?> constructor, Object[] args) throws BeanException {
        Class<?> clazz = beanDefinition.getBeanClass();
        try {
            if (constructor == null) {
                return clazz.getDeclaredConstructor().newInstance();
            } else {
                return clazz.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            }
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new BeanException("Java实例化Bean[" + clazz.getName() + "]失败");
        }
    }

}