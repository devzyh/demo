package cn.devzyh.smallspring.beans.factory;

import cn.devzyh.smallspring.beans.BeansException;

/**
 * Bean工厂接口
 */
public interface BeanFactory {

    /**
     * 获取Bean对象
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object getBean(String beanName) throws BeansException;

    /**
     * 获取Bean对象
     *
     * @param beanName
     * @param args
     * @return
     */
    Object getBean(String beanName, Object... args) throws BeansException;

}
