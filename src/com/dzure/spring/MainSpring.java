package com.dzure.spring;

import com.dzure.spring.model.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: jurez
 * Date: 3/21/13
 * Time: 2:32 PM
 */
public class MainSpring {

    public static void main(String[] args) {

        //Triangle triangle = new Triangle();
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");
        Triangle triangle= (Triangle) context.getBean("triangle");
        triangle.draw();

    }
}
