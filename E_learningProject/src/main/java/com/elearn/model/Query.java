package com.elearn.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Query {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int queryId;
	private String queryname;
	
	@OneToOne
	private Student student;
 
	public Query() {
		super();
	}
 
	public Query(int queryId, String queryname, Student student) {
		super();
		this.queryId = queryId;
		this.queryname = queryname;
		this.student = student;
	}

	public int getQueryId() {
		return queryId;
	}

	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}

	public String getQueryname() {
		return queryname;
	}

	public void setQueryname(String queryname) {
		this.queryname = queryname;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Query [queryId=" + queryId + ", queryname=" + queryname + ", student=" + student + "]";
	}
	
	 	
}
