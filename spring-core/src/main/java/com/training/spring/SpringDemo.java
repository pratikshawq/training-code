package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.spring.config.AppConfig;

public class SpringDemo {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		ApplicationContext javaContext=new AnnotationConfigApplicationContext(AppConfig.class);
		//Person p1=(Person)context.getBean("person");
		//System.out.println(p1.getFirstName()+":"+p1.getAge());
		//System.out.println(p1.getMyCar().getCarDetail());
		Person p2=javaContext.getBean(Person.class);
		System.out.println(p2.getMyCar().getCarDetail());
		//System.out.println(p1.getFirstName()+":"+p1.getAge());
	}

}
