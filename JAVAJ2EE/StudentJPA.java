package com.edub;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student_jpa")
public class StudentJPA {
	
	@javax.persistence.Id
	
	private Integer Id;
	private String name;
	private float fees;
	public StudentJPA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "StudentJPA [Id=" + Id + ", name=" + name + ", fees=" + fees + "]";
	}
	

}
