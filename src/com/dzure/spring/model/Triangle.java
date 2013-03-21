package com.dzure.spring.model;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/21/13
 * Time: 2:33 PM
 */
public class Triangle {

    private String type;
    private int height;

    // constructor injection
    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }
    //setter injection
    public void setType(String type) {
        this.type = type;
    }

    public void draw() {
        System.out.println("Triangle was drawn.");
        System.out.println("Triangle type: " + getType());
        System.out.println("Triangle heigth: " + getHeight());
    }
}
