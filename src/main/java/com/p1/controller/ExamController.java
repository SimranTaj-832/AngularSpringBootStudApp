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

import com.p1.model.Attendance;
import com.p1.model.Exams;
import com.p1.service.ExamsService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/")
@RestController
public class ExamController {
	@Autowired
	ExamsService exserv;
	@GetMapping("/all/exams")
	private List<Exams> getAllasnmt() {
	return exserv.getAllAsnmt();
	}
	@GetMapping("/my/exams/{sid}")
	private List<Exams> myAssignment(@PathVariable("sid") int sid) {
		List<Exams> lst= exserv.getAllAsnmt();
		List<Exams>lst1= new ArrayList<Exams>();
		for(Exams A: lst) {
			if(A.getSId()==sid) {
				lst1.add(A);
			}
		}return lst1;
	}
	@PostMapping("/add/exam")
	private int saveStudent(@RequestBody Exams stud) {
		int per=(stud.getMarks()*100)/stud.getTmarks();
		stud.setPercent(per);
		if(per<=30) {
			stud.setResult("Fail");
		}
		else if(per>30 &&per <= 60) {
			stud.setResult("Pass");
		}
		else if(per>60 &&per <= 75) {
			stud.setResult("Second Class");
		}
		else if(per>75 &&per <= 85) {
			stud.setResult("First Class");
		}
		else {
			stud.setResult("Distinction ");
		}
		exserv.saveOrUpdate(stud);
	return stud.getCId();
	}
	
	
}
