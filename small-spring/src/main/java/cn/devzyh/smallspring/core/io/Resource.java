package cn.devzyh.smallspring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源加载器接口
 */
public interface Resource {

    /**
     * 获取输入流
     *
     * @return
     */
    InputStream getInputStream() throws IOException;
}
