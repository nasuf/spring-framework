package org.nasuf.springframework.beans.factory;

import org.nasuf.springframework.BeansException;

public interface InitializingBean {
    void afterPropertiesSet() throws BeansException;
}
