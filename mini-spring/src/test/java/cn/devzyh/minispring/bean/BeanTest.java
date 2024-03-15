package cn.devzyh.minispring.bean;


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
