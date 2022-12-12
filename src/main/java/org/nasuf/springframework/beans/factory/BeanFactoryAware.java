package org.nasuf.springframework.beans.factory;

import org.nasuf.springframework.BeanFactory;
import org.nasuf.springframework.BeansException;

public interface BeanFactoryAware extends Aware {
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
