package com.dzure.spring.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/22/13
 * Time: 10:02 AM
 */
public class Circle implements Shape {


    private Point center;

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
        System.out.println("Drawing the circle");
        System.out.println("The point values are: " + center.getX() + ", " + center.getY());
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
}
