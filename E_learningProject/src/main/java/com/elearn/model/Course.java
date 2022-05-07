package com.elearn.model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

 

public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private double coursePrice;
	
	@ManyToOne
	private List<Topic> topics;
	
    private Teacher teacher;

	 
	
	public Course() {
		super();
	}



	public Course(int courseId, String courseName, double coursePrice, List<Topic> topics, Teacher teacher) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.topics = topics;
		this.teacher = teacher;
	}



	public int getCourseId() {
		return courseId;
	}



	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public double getCoursePrice() {
		return coursePrice;
	}



	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}



	public List<Topic> getTopics() {
		return topics;
	}



	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}



	public Teacher getTeacher() {
		return teacher;
	}



	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePrice=" + coursePrice
				+ ", topics=" + topics + ", teacher=" + teacher + "]";
	}


	
	
  
	
}
