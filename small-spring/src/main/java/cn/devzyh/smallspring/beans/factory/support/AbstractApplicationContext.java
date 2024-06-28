package cn.devzyh.smallspring.beans.factory.support;

import cn.devzyh.smallspring.beans.BeansException;
import cn.devzyh.smallspring.beans.factory.ConfigurableListableBeanFactory;
import cn.devzyh.smallspring.beans.factory.config.BeanFactoryPostProcessor;
import cn.devzyh.smallspring.beans.factory.config.BeanPostProcessor;
import cn.devzyh.smallspring.context.ConfigurableApplicationContext;
import cn.devzyh.smallspring.core.io.DefaultResourceLoader;

import java.util.Map;

/**
 * 上下文接口抽象实现类
 */
public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {

    @Override
    public void refresh() throws BeansException {
        // 创建Bean工厂，加载Bean定义
        refreshBeanFactory();

        // 获取Bean工厂
        ConfigurableListableBeanFactory beanFactory = getBeanFactory();

        // Bean实例化之前，执行BeanFactoryPostProcessor注册操作
        invokeBeanFactoryPostProcessors(beanFactory);

        // Bean对象实例化之前，执行BeanPostProcessor注册操作
        registerBeanPostProcessors(beanFactory);

        // 提前实例化单例对象
        beanFactory.preInstantiateSingletons();
    }

    /**
     * 创建Bean工厂，加载Bean定义
     */
    protected abstract void refreshBeanFactory();

    /**
     * 获取Bean工厂
     *
     * @return
     */
    protected abstract ConfigurableListableBeanFactory getBeanFactory();

    /**
     * 注册BeanFactoryPostProcessor操作
     *
     * @param factory
     * @throws BeansException
     */
    private void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory factory) throws BeansException {
        Map<String, BeanFactoryPostProcessor> beansOfType = factory.getBeansOfType(BeanFactoryPostProcessor.class);
        for (BeanFactoryPostProcessor processor : beansOfType.values()) {
            processor.postProcessBeanFactory(factory);
        }
    }

    /**
     * 注册BeanPostProcessor操作
     *
     * @param factory
     */
    private void registerBeanPostProcessors(ConfigurableListableBeanFactory factory) throws BeansException {
        Map<String, BeanPostProcessor> beansOfType = factory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor processor : beansOfType.values()) {
            factory.addBeanPostProcessor(processor);
        }
    }
}
