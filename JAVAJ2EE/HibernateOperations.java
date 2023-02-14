package com.home;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.query.Query;

public class HibernateOperations {

	public static void addEmployee(SessionFactory sf) {
		System.out.println("Add employee");
		//Session ss=sf.openSession();
		try(Session ss=sf.openSession()){
			Transaction t=ss.beginTransaction();
			
			EmployeeHQL e1 = new EmployeeHQL();
			e1.setEmployeeName("shailu");
			e1.setEmployeeSalary(7896f);
			ss.save(e1);
			
			EmployeeHQL e2 = new EmployeeHQL();
			e2.setEmployeeName("krithi");
			e2.setEmployeeSalary(7866f);
			ss.save(e2);
			
			EmployeeHQL e3= new EmployeeHQL();
			e3.setEmployeeName("domii");
			e3.setEmployeeSalary(7796f);
			ss.save(e3);
			t.commit();
			}
		
	}

	public static void getAllRecords(SessionFactory sf) {
		System.out.println("getallrecords");
				try(Session ss=sf.openSession()){
					Transaction t=ss.beginTransaction();
					String sql="FROM EmployeeHQL";
					Query<EmployeeHQL> list=ss.createQuery(sql,EmployeeHQL.class); 
					List<EmployeeHQL> l=list.list();
					Iterator<EmployeeHQL> it=l.iterator();
					System.out.println("ID\tName\tSalary");
					
					while(it.hasNext()) {
					EmployeeHQL eob=it.next();	
					
						System.out.println(eob.getEmployeeId()+"\t"+eob.getEmployeeName()+"\t"+eob.getEmployeeSalary());
					}//while
				}//try			
				
			}//getRecords

	
		
	

	public static void getEmployeeById(SessionFactory sf) {
		System.out.println("getEmployeeId");

		try(Session session=sf.openSession()){
			//get employee
			String sel="FROM EmployeeHQL where employeeId=:id";
			Query<EmployeeHQL> q=session.createQuery(sel, EmployeeHQL.class);
			q.setParameter("id", 1); //position starts 0
			EmployeeHQL eob=q.uniqueResult(); //singleresult
			System.out.println(eob);
			
		}

		
		
	}

	public static void updateEmployeeName(SessionFactory sf) {
		System.out.println("UpdateEmployeeId");

		try(Session session=sf.openSession()){
			
			Transaction tx=session.beginTransaction();
			Query q=session.createQuery("update EmployeeHQL set employeeName=:n where employeeId=:i");  
			q.setParameter("n","Udit Kumar");  
			q.setParameter("i",1);  
			  
			int status=q.executeUpdate();  
			if(status>1) {
			System.out.println(status +"Record updated");  
			tx.commit();  

			}
		}
		
	}

		
	

	public static void deleteEmployeeById(SessionFactory sf) {
		System.out.println("deleteEmployeeId");

		
		try(Session session=sf.openSession()){
			
			Transaction tx=session.beginTransaction();
			Query q=session.createQuery("delete from EmployeeHQL where employeeId=2");  
			//specifying class name (Emp) not tablename  
			
			int status=q.executeUpdate();  
			if(status>1) {
			System.out.println(status +"Record deleted");  
			tx.commit();  

			}
			
		}
	}
	}

		
		
	


