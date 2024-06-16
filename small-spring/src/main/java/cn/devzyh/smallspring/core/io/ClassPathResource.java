package cn.devzyh.smallspring.core.io;

import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.ClassLoaderUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 类资源加载器
 */
public class ClassPathResource implements Resource {

    private String path;

    private ClassLoader classLoader;

    public ClassPathResource(String path) {
        this(path, null);
    }

    public ClassPathResource(String path, ClassLoader classLoader) {
        this.path = path;
        this.classLoader = classLoader == null ? ClassLoaderUtil.getClassLoader() : classLoader;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        InputStream stream = this.classLoader.getResourceAsStream(path);
        if (stream == null) {
            throw new FileNotFoundException("ClassPath下" + this.path + "文件不存在");
        }

        return stream;
    }
}
