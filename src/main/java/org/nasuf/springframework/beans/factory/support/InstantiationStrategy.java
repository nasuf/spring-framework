package org.nasuf.springframework.beans.factory.support;

import org.nasuf.springframework.BeansException;
import org.nasuf.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName,
                       Constructor constructor, Object[] args) throws BeansException;

}
