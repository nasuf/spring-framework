package org.nasuf.springframework.context.event;

import org.nasuf.springframework.context.ApplicationEvent;
import org.nasuf.springframework.context.ApplicationListener;

public interface ApplicationEventMulticaster {
    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
