package com.spell;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpell {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		TextEditor txt=(TextEditor) ctx.getBean("texteditor");
		txt.callSpellCheck();
	}



	}

