package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.spring.config.AppConfig;

public class CarDemo {

	
		public static void main(String[] args) {
			//ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
			ApplicationContext javaContext=new AnnotationConfigApplicationContext(AppConfig.class);
			//Car c1=(Car)context.getBean("car");
			//System.out.println(p1.getMake()+":"+p1.getModel()+":"+p1.getYear());
			Car c2=javaContext.getBean(Car.class);
			System.out.println(c2.getModel()+":"+c2.getMake()+":"+c2.getYear());
			//p2.setMake("Honda");
			//System.out.println(p1.getMake()+":"+p1.getYear());
		

		

	}

}
