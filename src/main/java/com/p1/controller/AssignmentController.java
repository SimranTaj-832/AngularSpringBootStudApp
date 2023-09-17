package com.p1.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p1.model.*;
import com.p1.service.*;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
@RestController
public class AssignmentController {
	@Autowired
	AssignmentService aserv;
	
	@GetMapping("/all/assignment")
	private List<Assignment> getAllasnmt() {
	return aserv.getAllAsnmt();
	}
	@GetMapping("/my/assignment/{sid}")
	private List<Assignment> myAssignment(@PathVariable("sid") int sid) {
		List<Assignment> lst= aserv.getAllAsnmt();
		List<Assignment>lst1= new ArrayList<Assignment>();
		for(Assignment A: lst) {
			if(A.getSId()==sid) {
				lst1.add(A);
			}
		}return lst1;
	}
	@PostMapping("/assignment/submit")
	private Assignment SubmitAsnmt(@RequestBody Assignment ast) {
		aserv.saveOrUpdate(ast);
	return ast;
	}
}
