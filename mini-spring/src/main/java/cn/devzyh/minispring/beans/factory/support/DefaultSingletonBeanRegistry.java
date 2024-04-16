package cn.devzyh.minispring.beans.factory.support;

import cn.devzyh.minispring.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认实现类
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletons = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletons.get(beanName);
    }

    /**
     * 添加单例对象
     *
     * @param beanName
     * @param obj
     */
    protected void addSingleton(String beanName, Object obj) {
        this.singletons.put(beanName, obj);
    }

}
