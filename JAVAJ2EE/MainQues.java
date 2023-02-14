package com.ques;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainQues {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		Question q=(Question)ctx.getBean("question");  
	    q.displayInfo();  
	}

}



	


