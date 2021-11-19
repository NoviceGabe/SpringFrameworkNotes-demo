package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

       Ferrari ferrari = (Ferrari) context.getBean("ferrari", Car.class); // retrieve bean
       ferrari.start();
       ferrari.accelerate();
       ferrari.stop();
       System.out.println(ferrari.getName());
     
       
       context.close();
    }
}
