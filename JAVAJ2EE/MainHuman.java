package com.man;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHuman {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Body bob=(Body) context.getBean("body");
	bob.bodyMethod();
	

	}

}
