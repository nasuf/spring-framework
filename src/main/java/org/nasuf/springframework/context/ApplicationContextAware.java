package org.nasuf.springframework.context;

import org.nasuf.springframework.BeansException;
import org.nasuf.springframework.beans.factory.Aware;

public interface ApplicationContextAware extends Aware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
