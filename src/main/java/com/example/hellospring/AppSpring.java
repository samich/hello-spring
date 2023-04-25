package com.example.hellospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.*;

public class AppSpring {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigTest.class);
		
	}

}
