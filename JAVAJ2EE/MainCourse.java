package com.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainCourse {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student1.class);
		config.addAnnotatedClass(Course.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
		
		Student1 student = new Student1();
		student.setStudentFees(5600);
		student.setStudentId(1);
		student.setStudentName("google");
		
		Course course = new Course();
		course.setCourseId(2);
		course.setCourseName("AWS");
		
		ss.save(student);
		ss.save(course);
		t.commit();
		ss.close();
		System.out.println("Student and course details are saved");
		

	}

}
