package org.nasuf.springframework.common;

import org.nasuf.springframework.BeansException;
import org.nasuf.springframework.PropertyValue;
import org.nasuf.springframework.PropertyValues;
import org.nasuf.springframework.beans.factory.ConfigurableListableBeanFactory;
import org.nasuf.springframework.beans.factory.config.BeanDefinition;
import org.nasuf.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("company", "Byte Dancing"));
    }
}
