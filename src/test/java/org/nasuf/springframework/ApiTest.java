package org.nasuf.springframework;


import org.junit.Test;
import org.nasuf.springframework.bean.UserService;
import org.nasuf.springframework.beans.factory.config.BeanDefinition;
import org.nasuf.springframework.beans.factory.support.DefaultListableBeanFactory;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }

}
