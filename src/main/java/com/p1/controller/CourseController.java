package com.p1.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.model.*;
import com.p1.service.*;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
@RestController
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@GetMapping("/all/courses")
	private List<Course> getAllCourse() {
	return courseService.getAllCourses();
	}
	
	@DeleteMapping("/remove/{courseid}")
	private void deleteCourse(@PathVariable("courseid") int corid) {
		courseService.delete(corid);
	}


	@PostMapping("/add/course")
	private int saveCorse(@RequestBody Course cust) {
		courseService.saveOrUpdate(cust);
	return cust.getCId();
	}
	
	@PutMapping("/update/course")
	private Course update(@RequestBody Course cust) {
		courseService.update(cust);
	return cust;
	}
}
