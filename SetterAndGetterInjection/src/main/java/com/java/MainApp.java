package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("spring.xml");
		Product p=(Product) cxt.getBean("prodob"); 
		p.display();

	}

}
