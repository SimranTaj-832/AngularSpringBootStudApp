package com.p1.controller;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.p1.model.*;
import com.p1.service.*;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
@RestController
public class StudentController {
	@Autowired
	StudentService studService;
	
	@GetMapping("/all/student")
	private List<Student> getAllstudent() {
	return studService.getAllStudents();
	}
	@GetMapping("/student/{sid}")
	private Student getStudent(@PathVariable("sid")int sid){
		return studService.getStudentById(sid);
	}
	
	@PostMapping("/add/student")
	private int saveStudent(@RequestBody Student stud) {
		studService.saveOrUpdate(stud);
	return stud.getSid();
	}
	@DeleteMapping("/remove/student/{studid}")
	private void deletestud(@PathVariable("studid") int aid) {
		studService.deleteStudent(aid);
	}
	
	 @GetMapping("/login")
	    public ModelAndView login() {
	     ModelAndView mav = new ModelAndView("login");
	        mav.addObject("stud", new Student());
	        return mav;
	    }
	

//	@RequestMapping(value= {"/logout"}, method=RequestMethod.POST)
//	public String logoutDo(HttpServletRequest request, HttpServletResponse response) {
//		return "redirect:/login";
//	}
	 @PostMapping("/student/update")
		private Student SubmitAsnmt(@RequestBody Student ast) {
		 studService.saveOrUpdate(ast);
		return ast;
		}
	
	@PostMapping("/student/login")
	private String Login(@RequestParam int id,@RequestParam String pass) {
		Student lst= studService.login(id, pass);
		System.out.println(lst);
			if(Objects.nonNull(lst)) {
				return "redirect:/student";
			}
			else { return"redirect/login"; }
	}
}
