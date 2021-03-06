package com.dzure.spring;

import com.dzure.spring.model.Shape;
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
        context.registerShutdownHook();
        //Shape shape = (Shape) context.getBean("shape");
        Shape shape = (Shape) context.getBean("circle");
        shape.draw();

        /**
         * Getting message from properties file via application context.
         */
        System.out.println(context.getMessage("greeting", null, "default - hey man", null));

    }
}
