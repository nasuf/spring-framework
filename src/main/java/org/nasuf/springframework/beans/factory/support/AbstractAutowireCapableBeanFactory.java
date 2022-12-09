package org.nasuf.springframework.beans.factory.support;

import org.nasuf.springframework.BeansException;
import org.nasuf.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed.", e);
        }
        registerSingleton(beanName, bean);
        return bean;
    }
}
