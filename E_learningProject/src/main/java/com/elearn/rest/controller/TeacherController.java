package com.elearn.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.elearn.model.AnswerQuery;
import com.elearn.model.Course;
import com.elearn.model.Query;
import com.elearn.service.TeacherService;

public class TeacherController {

	
	@Autowired
	private TeacherService teacherService;
	
	
	   @PostMapping("/addcourse")
	   public void addCourse(@RequestBody  Course course)
	   {
	      
		 teacherService.addCourse(course);
		   
	    }
	 

	    @PutMapping("/udatecourse/{id}")
	    public void update(@RequestBody Course course,@PathVariable(name = "id") int courseId)
	    {
	         
	    	teacherService.update(course, courseId);
	    }

	    
	    @DeleteMapping("/deletecourse/{id}")
	    public void delete(@PathVariable(name = "id") int  courseid) 
	    {
 teacherService.delete(courseid);
	    	
	    }


	    @GetMapping("/getall")
	    public List<Course> getAll() {
	     
	    	return teacherService.getAll();
	    }

	
	    @GetMapping("/browsequerys")
	public List<Query> browseQuerys()
	{ 
	    	return teacherService.browseQuerys();
	}
	
	
	 @PostMapping("/replyquery/{id}")
	public void replyQuery(@PathVariable(name = "id")  int queryid,@RequestBody  AnswerQuery answerQuery) 
	{ 
		 teacherService.replyQuery(queryid, answerQuery); 		
	}
	
	
	
	
	
}
