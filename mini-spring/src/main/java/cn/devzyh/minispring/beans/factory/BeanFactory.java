package cn.devzyh.minispring.beans.factory;

import cn.devzyh.minispring.beans.BeanException;

/**
 * Bean工厂接口
 */
public interface BeanFactory {

    /**
     * 获取Bean对象
     *
     * @param beanName
     * @return
     * @throws BeanException
     */
    Object getBean(String beanName) throws BeanException;

}
