package com.one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_table")

public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseId;
	
	@Column(name="cname",length=60,nullable = false)
	private String courseName;

	public Course() {
		super();
		
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

}
