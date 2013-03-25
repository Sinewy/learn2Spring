package com.dzure.spring.model;

import com.dzure.spring.DrawEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/22/13
 * Time: 10:02 AM
 */

/**
 * This annotation defines this class as a bean in spring... this means we do not need
 * this circle bean to be defined in spring xml file.
 * The problem of annotation style is that you cannot have multiple instances of this class.
 * More different behaviours/beans of the same class.
 *
 * In EE development we have different types of beans and we can mark them with Stereotype Annotations:
 * @Service, @Repository (this means data), @Controller - no different as @Component, it only gives some
 * additional information, also documentation benefits
 */
//@Component
@Controller
public class Circle implements Shape, ApplicationEventPublisherAware {


    private Point center;
    private ApplicationEventPublisher publisher;

    /**
     * To get message in out beans we can as well use application context
     * or we can autowire (wire by type) this bean - defined in spring xml
     */
    @Autowired
    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public Point getCenter() {
        return center;
    }

    /**
     * another way of injecting or wireing beans
     */
    @Resource(name = "pointC")
    //@Autowired
    //@Qualifier("circleRelated")
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        //System.out.println("Drawing the circle");
        //System.out.println("The point values are: " + center.getX() + ", " + center.getY());
        System.out.println("Print the message: " + messageSource.getMessage("greeting", null, "default", null));
        System.out.println("Print the message: " + messageSource.getMessage("greeting", null, "default", Locale.ENGLISH));
        System.out.println("Print the message: " + messageSource.getMessage("greeting", null, "default", Locale.GERMAN));
        System.out.println(messageSource.getMessage("drawing.circe", null, "default", Locale.ENGLISH));
        System.out.println(messageSource.getMessage("drawing.circe", null, "default", Locale.GERMAN));
        System.out.println(messageSource.getMessage("drawing.point", new Object[]{center.getX(), center.getY()}, "default", null));
        System.out.println(messageSource.getMessage("drawing.point", new Object[]{center.getX(), center.getY()}, "default", Locale.ENGLISH));
        // Need to check how to add my own locale versions.
        System.out.println(messageSource.getMessage("drawing.point", new Object[]{center.getX(), center.getY()}, "default", Locale.GERMAN));
        /**
         * To use our own event we need to publish it.
         * Spring has to set the publisher in order to use it and publish events.
         * We need to implement ApplicationEventPublicherAware
         */
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);

    }

    /**
     * different way of callbacks
     * this one is called right after bean is initialized
     */
    @PostConstruct
    public void myInitMethodCircle() {
        System.out.println("My init method is called - circle initialized");
    }

    /**
     * different way of callbacks
     * this one is called just before the bean is destroyed
     */
    @PreDestroy
    public void myDestroyMethodCircle() {
        System.out.println("My destory method is called - circle destroyed");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        // spring gives us application context publisher - we assign it to our local publisher
        this.publisher = applicationEventPublisher;
    }
}
