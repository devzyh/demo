package cn.devzyh.smallspring.beans.factory.support;

import cn.devzyh.smallspring.core.io.DefaultResourceLoader;
import cn.devzyh.smallspring.core.io.ResourceLoader;

/**
 * Bean定义读取器抽象实现类
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader loader;

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader loader) {
        this.registry = registry;
        this.loader = loader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return this.registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return this.loader;
    }
}
