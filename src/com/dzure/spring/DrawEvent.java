package com.dzure.spring;

import org.springframework.context.ApplicationEvent;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/25/13
 * Time: 12:06 PM
 */

public class DrawEvent extends ApplicationEvent {

    public DrawEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Draw Event Circe.";
    }
}
