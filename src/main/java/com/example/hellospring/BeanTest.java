package com.example.hellospring;

import org.springframework.context.annotation.*;
import com.example.config.*;

public class BeanTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigTest.class);
		
		//get bean by method name
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		
		//get bean by a different name
		System.out.println(context.getBean("age2"));
				
		//System.out.println(context.getBean("person1"));
		System.out.println(context.getBean("person3"));
		
		//get primary bean by class
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean("person5"));
		//get the qualifier bean
		System.out.println(context.getBean("person6"));
		
		context.close();
		
	}

}
