package org.nasuf.springframework.context;

import org.nasuf.springframework.BeansException;

public interface ConfigurableApplicationContext extends ApplicationContext {
    void refresh() throws BeansException;
}
