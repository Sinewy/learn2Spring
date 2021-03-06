package com.dzure.spring.model;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/21/13
 * Time: 2:33 PM
 */

public class Triangle implements Shape {

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

    @Override
    public void draw() {
        System.out.println("Triangle was drawn.");
        System.out.println("Point A: " + getPointA().getX() + ", " + getPointA().getY());
        System.out.println("Point B: " + getPointB().getX() + ", " + getPointB().getY());
        System.out.println("Point C: " + getPointC().getX() + ", " + getPointC().getY());
    }

}
