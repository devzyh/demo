package cn.devzyh.smallspring.beans.factory.support;

import cn.devzyh.smallspring.beans.factory.ConfigurableListableBeanFactory;

/**
 * 可刷新容器的上下文抽象实现类
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() {
        DefaultListableBeanFactory factory = createBeanFactory();
        loadBeanDefinitions(factory);
        this.beanFactory = factory;
    }

    /**
     * 创建Bean工厂
     * @return
     */
    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    /**
     * 加载Bean定义
     *
     * @param factory
     */
    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory factory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return this.beanFactory;
    }
}
