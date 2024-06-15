package cn.devzyh.smallspring.beans.factory.config;

/**
 * 单例Bean注册接口
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例对象
     *
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

}
