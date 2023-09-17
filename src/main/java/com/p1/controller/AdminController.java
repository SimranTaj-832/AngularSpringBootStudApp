package com.p1.controller;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.p1.model.*;
import com.p1.service.*;

@RestController
public class AdminController {
	@Autowired
	AdminService adminservice;
	
	@GetMapping("/all/admins")
	private List<Admin> getAdmins(){
		return adminservice.getAllAdmins();
	}
	
	@PostMapping("/add/admin")
	private Admin addAdmin(@RequestBody Admin adm) {
		return adminservice.addAdmin(adm);
	}
	
	@DeleteMapping("/remove/admin/{admid}")
	private void deleteadmin(@PathVariable("admid") int aid) {
		adminservice.deleteadmin(aid);
	}
	
	@PostMapping("/admin/login")
	private String admlogin(@RequestParam int aid,@RequestParam String apass) {
		Admin adm= adminservice.Login(aid, apass);
		System.out.println(adm);
		if(Objects.nonNull(adm)) {
			return "redirect:/admin";
		}
		else { return"redirect/login"; }
	}
}
