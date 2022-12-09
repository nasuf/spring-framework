package org.nasuf.springframework.beans.factory.support;

import org.nasuf.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();

}
