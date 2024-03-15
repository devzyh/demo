package cn.devzyh.minispring.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Bean工厂
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanMap = new HashMap<>();

    /**
     * 注册Bean对象
     *
     * @param name
     * @param bean
     */
    public void registerBeanDefinition(String name, BeanDefinition bean) {
        this.beanMap.put(name, bean);
    }

    /**
     * 获取Bean对象
     *
     * @param name
     * @return
     */
    public Object getBean(String name) {
        return this.beanMap.get(name).getBean();
    }

}
