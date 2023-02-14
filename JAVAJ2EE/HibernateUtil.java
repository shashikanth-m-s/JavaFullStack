package com.home;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil{
	

public static SessionFactory getSessionFact() {
	//Create configuration
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.addAnnotatedClass(EmployeeHQL.class);
	
  //Configuration config1=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);

	//create SessionFactory 
	SessionFactory sf=config.buildSessionFactory();
	
	return sf;
	}
}
