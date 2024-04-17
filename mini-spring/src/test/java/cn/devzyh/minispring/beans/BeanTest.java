package cn.devzyh.minispring.beans;

import cn.devzyh.minispring.beans.factory.config.BeanDefinition;
import cn.devzyh.minispring.beans.factory.support.DefaultListableBeanFactory;
import cn.devzyh.minispring.beans.service.UserService;
import org.junit.jupiter.api.Test;

public class BeanTest {

    /**
     * Bean工厂测试
     */
    @Test
    public void testBeanFactory() throws BeanException {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinition definition = new BeanDefinition(UserService.class);
        String beanName = "userService";
        factory.registerBeanDefinition(beanName, definition);

        UserService service1 = (UserService) factory.getBean(beanName);
        service1.hello();

        UserService service2 = (UserService) factory.getBean(beanName);
        service2.hello();
    }

    /**
     * 带有构造参数的Bean对象实例化
     *
     * @throws BeanException
     */
    @Test
    public void testBeanWithArgs() throws BeanException {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinition definition = new BeanDefinition(UserService.class);
        String beanName = "userService";
        factory.registerBeanDefinition(beanName, definition);

        UserService service = (UserService) factory.getBean(beanName, "zhangsan");
        service.say();
    }

}
