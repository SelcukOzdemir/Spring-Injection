package com.sso.injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
	    ApplicationContext context = 
	             new ClassPathXmlApplicationContext("SpringConf.xml");
       
       Car car = (Car) context.getBean("car");
       System.out.println(car.toString());

	}

}
