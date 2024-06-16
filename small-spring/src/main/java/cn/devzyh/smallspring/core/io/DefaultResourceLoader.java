package cn.devzyh.smallspring.core.io;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 资源加载器包装-默认实现
 */
public class DefaultResourceLoader implements ResourceLoader {

    @Override
    public Resource getResource(String location) {
        if (location.startsWith(CLASSPATH_PREFIX)) {
            return new ClassPathResource(location.substring(CLASSPATH_PREFIX.length()));
        }

        try {
            return new UrlResource(new URL(location));
        } catch (MalformedURLException e) {
            return new FileSystemResource(location);
        }
    }
}
