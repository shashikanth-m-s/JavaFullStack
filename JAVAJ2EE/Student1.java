package com.one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students_Table")
public class Student1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sid")
	private Integer studentId;
	@Column(name="sname",length = 50,nullable = false)
    private String studentName;
	private float studentFees;
	
	@OneToOne(cascade = CascadeType.ALL)
	Course course;

	public Student1() {
		super();
		
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getStudentFees() {
		return studentFees;
	}

	public void setStudentFees(float studentFees) {
		this.studentFees = studentFees;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	
	}
	
	

