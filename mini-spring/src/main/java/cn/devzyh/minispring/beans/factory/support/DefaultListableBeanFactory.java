package cn.devzyh.minispring.beans.factory.support;

import cn.devzyh.minispring.beans.BeanException;
import cn.devzyh.minispring.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认Bean注册获取实现类
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    // 存储定义数据
    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeanException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeanException("Bean定义不存在");
        }
        return beanDefinition;
    }

}
