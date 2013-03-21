package com.dzure.spring.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/21/13
 * Time: 2:33 PM
 */
public class Triangle implements ApplicationContextAware, BeanNameAware {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    /**
     * We can use interfaces ApplicationContextAware, BeanNameAware and others to enable
     * certain functionality in a bean. For example ApplicationContextAware makes context available
     * in the bean and we can get other beans inside with getBean method.
     * If we want to know the name that is used in spring configuration we can simply use
     * BeanNameAware interface and get the names.
     */

    private ApplicationContext context = null;
    private String beanName;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Triangle was drawn.");
        System.out.println("Point A: " + getPointA().getX() + ", " + getPointA().getY());
        System.out.println("Point B: " + getPointB().getX() + ", " + getPointB().getY());
        System.out.println("Point C: " + getPointC().getX() + ", " + getPointC().getY());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
        System.out.println("Bean name is: " + s);
    }
}
