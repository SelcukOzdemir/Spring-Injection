package com.sso.injection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        ApplicationContext context = 
	             new ClassPathXmlApplicationContext("SpringConf.xml");
        
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.toString());
    }
}
