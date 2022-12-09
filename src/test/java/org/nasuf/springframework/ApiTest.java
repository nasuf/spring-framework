package org.nasuf.springframework;


import org.junit.Test;
import org.nasuf.springframework.bean.UserDao;
import org.nasuf.springframework.bean.UserService;
import org.nasuf.springframework.beans.factory.config.BeanDefinition;
import org.nasuf.springframework.beans.factory.config.BeanReference;
import org.nasuf.springframework.beans.factory.support.DefaultListableBeanFactory;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        beanFactory.registerBeanDefinition("userService", new BeanDefinition(UserService.class, propertyValues));

        UserService userService = (UserService) beanFactory.getBean("userService", "nasuf");
        userService.queryUserInfo();
    }

}
