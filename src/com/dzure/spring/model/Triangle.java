package com.dzure.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/21/13
 * Time: 2:33 PM
 */

/**
 * One way to write init and destroy methods is to implement the following interfaces.
 * This will make you implement the methods below.
 * The downside of this is that we are bind to spring - we are using the methods of spring and
 * we have to implement and change them in out code.
 */
public class Triangle implements InitializingBean, DisposableBean {

    private Point pointA;
    private Point pointB;
    private Point pointC;

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

    /**
     * This method will be called right after the bean is initialized.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean for Triangle.");
    }

    /**
     * This method is called just before the bean is destroyed.
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("The bean for Triangle just being destroyed.");
    }

}
