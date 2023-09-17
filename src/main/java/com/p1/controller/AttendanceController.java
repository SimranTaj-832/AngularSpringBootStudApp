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
@RequestMapping("/api/v1")
@RestController
public class AttendanceController {
	@Autowired
	AttendanceService attserv;
	
	@GetMapping("/all/attendance")
	private List<Attendance> getAllCourse() {
	return attserv.getAllAttends();
	}
	@PostMapping("/add/attendance")
	private Attendance saveAttn(@RequestBody Attendance attn) {
		attserv.saveOrUpdate(attn);
	return attn;
	}
	@GetMapping("/my/attendance/{sid}")
	private List<Attendance> myAttendance(@PathVariable("sid") int sid) {
		List<Attendance> lst= attserv.getAllAttends();
		List<Attendance>lst1= new ArrayList<Attendance>();
		for(Attendance A: lst) {
			if(A.getSId()==sid) {
				lst1.add(A);
			}
		}return lst1;
	}
}
