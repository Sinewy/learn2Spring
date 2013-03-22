package com.dzure.spring;

import com.dzure.spring.model.Circle;
import com.dzure.spring.model.Shape;
import com.dzure.spring.model.Triangle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/21/13
 * Time: 2:32 PM
 */
public class MainSpring {

    public static void main(String[] args) {

        AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");

        Circle circle = (Circle) context.getBean("circle");
        circle.draw();

        Triangle triangle= (Triangle) context.getBean("triangle");
        triangle.draw();

        /**
         * We can use each shape separately or use the interface
         * and set which shape will be drawn in get bean.. or  in the spring config.
         */
        //Shape shape = (Shape) context.getBean("circle");
        Shape shape = (Shape) context.getBean("triangle");
        shape.draw();

        Shape shape2 = (Shape) context.getBean("shape");
        shape2.draw();


    }
}
