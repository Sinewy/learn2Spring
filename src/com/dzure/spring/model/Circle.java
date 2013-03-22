package com.dzure.spring.model;

import org.springframework.beans.factory.annotation.Required;

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

    @Required
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing the circle");
        System.out.println("The point values are: " + center.getX() + ", " + center.getY());
    }
}
