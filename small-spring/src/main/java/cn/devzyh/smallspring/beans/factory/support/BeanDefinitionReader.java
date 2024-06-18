package cn.devzyh.smallspring.beans.factory.support;

import cn.devzyh.smallspring.beans.BeansException;
import cn.devzyh.smallspring.core.io.Resource;
import cn.devzyh.smallspring.core.io.ResourceLoader;

/**
 * Bean定义读取器
 */
public interface BeanDefinitionReader {

    /**
     * 获取Bean注册器
     *
     * @return
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 获取资源加载器
     *
     * @return
     */
    ResourceLoader getResourceLoader();

    /**
     * 加载Bean定义
     *
     * @param resource
     */
    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
