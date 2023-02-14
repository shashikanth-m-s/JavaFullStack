package com.fact;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class Test {  
public static void main(String[] args) {  
    ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");  
    A a=(A)context.getBean("a");  
    a.msg();  
    A a1=(A)context.getBean("a1");  
    a1.msg();
}  
}  
	


