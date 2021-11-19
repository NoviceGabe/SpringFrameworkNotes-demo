package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

       Car ferrari = context.getBean("ferrari", Car.class); // retrieve bean
       ferrari.start();
       ferrari.accelerate();
       ferrari.stop();
       
       context.close();
    }
}
