package org.nasuf.springframework.event;

import org.nasuf.springframework.context.ApplicationListener;

import java.util.Date;

public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("Received: " + event.getSource() + " message; Timestamp: " + new Date());
        System.out.println("Message: " + event.getId() + ":" + event.getMessage());
    }
}
