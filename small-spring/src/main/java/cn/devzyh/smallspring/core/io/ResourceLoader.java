package cn.devzyh.smallspring.core.io;

/**
 * 资源加载器包装-接口
 */
public interface ResourceLoader {

    /**
     * 类资源路径前缀
     */
    String CLASSPATH_PREFIX = "classpath:";

    /**
     * 获取资源
     * @param location 资源位置
     * @return
     */
    Resource getResource(String location);
}
