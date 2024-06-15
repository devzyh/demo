package cn.devzyh.smallspring.beans;

import cn.hutool.core.util.StrUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象属性
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValues = new ArrayList<>();

    /**
     * 添加属性
     *
     * @param pv
     */
    public void addPropertyValue(PropertyValue pv) {
        this.propertyValues.add(pv);
    }

    /**
     * 获取属性列表
     *
     * @return
     */
    public PropertyValue[] getPropertyValues() {
        return this.propertyValues.toArray(new PropertyValue[0]);
    }

    /**
     * 获取指定属性值
     *
     * @param name
     * @return
     */
    public PropertyValue getPropertyValue(String name) {
        for (PropertyValue pv : this.propertyValues) {
            if (StrUtil.equals(pv.getName(), name)) {
                return pv;
            }
        }
        return null;
    }
}
