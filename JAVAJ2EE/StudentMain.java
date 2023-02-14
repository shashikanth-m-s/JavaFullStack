package com.edub;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.query.Query;

public class StudentMain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin( );  
		        
			    Query query = (Query) em.createQuery( "Select s from StudentJPA s");  
		        
		        @SuppressWarnings("unchecked")  
		      List<StudentJPA> list=(List<StudentJPA>)query.getResultList( );  
		         
		       /* System.out.print("ID");  
		        System.out.print("\t Name");  
		       System.out.println("\tFees");  
		          
		          
		        for( StudentJPA s:list ){  
		           System.out.print( s.getId( ));  
		           System.out.print("\t" +  s.getName( ));  
		           System.out.print("\t" + s.getFees( ));  
		           System.out.println();  
		           }  
		        em.getTransaction().commit();  
		          
		     }*/
		//try with iterator
		        Iterator<StudentJPA> it=list.iterator();
		        System.out.println("ID\tName\tFees");
		        while(it.hasNext()) {
		        	StudentJPA sob=it.next();
		        	System.out.println(sob.getId()+"\t"+sob.getName()+"\t"+sob.getFees());
		        }
}
}

