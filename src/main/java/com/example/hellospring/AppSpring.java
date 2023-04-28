package com.example.hellospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.*;
import com.example.game.GameConsole;
import com.example.game.GameRunner;

public class AppSpring {
	
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
				) {
			
			
			context.getBean(GameConsole.class).up();
			context.getBean(GameRunner.class).run();
			
		}
				
	}

}
