package com.dzure.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/25/13
 * Time: 11:39 AM
 */

@Component
public class MyEventListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("Event is: " + applicationEvent.toString());
    }
}
