package org.nasuf.springframework.beans.factory.config;

import org.nasuf.springframework.BeansException;
import org.nasuf.springframework.beans.factory.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
