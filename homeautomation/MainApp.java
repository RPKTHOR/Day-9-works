package com.homeautomation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HomeAutomationService service = context.getBean(HomeAutomationService.class);
		service.controlDevice();
	}

}
