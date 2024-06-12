package cn.devzyh.minispring.beans.factory.config;

import cn.devzyh.minispring.beans.PropertyValue;
import cn.devzyh.minispring.beans.PropertyValues;

/**
 * Bean对象定义
 */
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues == null ? new PropertyValues() : propertyValues;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValues.addPropertyValue(pv);
    }

}
