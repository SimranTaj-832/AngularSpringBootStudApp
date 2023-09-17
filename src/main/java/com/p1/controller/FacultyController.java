package com.p1.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.p1.model.*;
import com.p1.service.*;

@RestController
public class FacultyController {

	@Autowired
	FacultyService facservice;
	
	@GetMapping("/all/faculty")
	private List<Faculty> getAdmins(){
		return facservice.getAllFaculty();
	}
	
	
	@DeleteMapping("/remove/faculty/{fid}")
	private void deletestud(@PathVariable("fid") int aid) {
		facservice.deleteFaculty(aid);
	}
	
	@PostMapping("/faculty/login")
	private String faclogin(@RequestParam int fid,@RequestParam String fpass) {
		Faculty adm= facservice.Login(fid, fpass);
		System.out.println(adm);
		if(Objects.nonNull(adm)) {
			return "redirect:/fac";
		}
		else { return"redirect/login"; }
	}
}
