package org.nasuf.springframework.event;

import org.nasuf.springframework.context.ApplicationListener;
import org.nasuf.springframework.context.event.ContextClosedEvent;

public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("Context closed: " + event.getClass().getName());
    }
}
