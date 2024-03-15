package cn.devzyh.minispring.bean;

/**
 * Bean定义
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
    
}
