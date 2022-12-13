package org.nasuf.springframework.event;

import org.nasuf.springframework.context.ApplicationListener;
import org.nasuf.springframework.context.event.ContextRefreshedEvent;

public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Context Refreshed: " + event.getClass().getName());
    }
}
