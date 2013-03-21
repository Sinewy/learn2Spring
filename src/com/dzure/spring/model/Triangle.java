package com.dzure.spring.model;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/21/13
 * Time: 2:33 PM
 */
public class Triangle {

    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        System.out.println("Triangle was drawn.");

        for (Point point : points) {
            System.out.println("Point : " + point.getX() + ", " + point.getY());
        }
    }
}
