package cn.devzyh.smallspring.beans.factory.config;

/**
 * Bean依赖数据类型
 */
public class BeanReference {

    private String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
