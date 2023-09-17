package com.p1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.model.*;
import com.p1.repository.*;
@Service
public class AdminService {
	@Autowired
	AdminRepo adminrepo;
	
	public List<Admin> getAllAdmins(){
		return adminrepo.findAll();
	}
	
	public Admin addAdmin(Admin adm) {
		return adminrepo.save(adm);
	}
	
	public void deleteadmin(int aid) {
		adminrepo.deleteById(aid);
	}

	public Admin Login(int aid,String apass)
	{
		return adminrepo.findByAidAndApass(aid, apass);
	}
}
