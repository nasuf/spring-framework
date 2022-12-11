package org.nasuf.springframework.beans.factory;

import org.nasuf.springframework.BeansException;
import org.nasuf.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.nasuf.springframework.beans.factory.config.BeanDefinition;
import org.nasuf.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 *
 * @description Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 * @date 2022/3/9
 * /CodeDesignTutorials
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
