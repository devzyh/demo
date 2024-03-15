package cn.devzyh.minispring.test.bean;


import cn.devzyh.minispring.bean.BeanDefinition;
import cn.devzyh.minispring.bean.BeanFactory;
import org.junit.jupiter.api.Test;


public class BeanTest {

    @Test
    void test() {
        BeanFactory factory = new BeanFactory();

        String beanName = "userService";
        factory.registerBeanDefinition(beanName, new BeanDefinition(new UserService()));

        UserService userService = (UserService) factory.getBean(beanName);
        userService.hello();
    }
}
