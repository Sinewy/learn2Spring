package com.dzure.spring.model;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/21/13
 * Time: 2:33 PM
 */
public class Triangle {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw() {
        System.out.println("Triangle was drawn.");
        System.out.println("Triangle type: " + getType());
    }
}
