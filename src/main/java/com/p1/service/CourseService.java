package com.p1.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.model.*;
import com.p1.repository.*;
@Service
public class CourseService {
	@Autowired
	CourseRepo courserepo;
	
	public List<Course> getAllCourses(){
		List<Course> cst=new ArrayList<Course>();
		courserepo.findAll().forEach(cus->cst.add(cus));
		return cst;
	}
	
	public void saveOrUpdate(Course course)
	{
		courserepo.save(course);
	}
	
	public void delete(int id)
	{
		courserepo.deleteById(id);
	}
	
	public Course getCourseById(int id) {
		return courserepo.findById(id).get();
	}
	
	public void update(Course cust)
	{
		
		Course custd=getCourseById(cust.getCId());
		custd.setName(cust.getName());
		custd.setDuration(cust.getDuration());
		//custd.setFid(cust.getFid());
		custd.setTotalMarks(cust.getTotalMarks());
		courserepo.save(custd);
	}

}
