package cn.devzyh.smallspring.context;

import cn.devzyh.smallspring.beans.BeansException;

/**
 * 可配置的上下文接口
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
