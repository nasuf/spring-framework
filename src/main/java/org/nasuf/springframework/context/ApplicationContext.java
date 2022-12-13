package org.nasuf.springframework.context;

import org.nasuf.springframework.beans.factory.HierarchicalBeanFactory;
import org.nasuf.springframework.beans.factory.ListableBeanFactory;
import org.nasuf.springframework.core.io.ResourceLoader;

public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
