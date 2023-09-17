package com.p1.service;
import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.model.*;
import com.p1.repository.*;
@Service
public class FacultyService {
	@Autowired
	FacultyRepo facrepo;

	public List<Faculty> getAllFaculty(){
		List<Faculty> cst=new ArrayList<Faculty>();
		facrepo.findAll().forEach(cus->cst.add(cus));
		return cst;
	}
	
	public void saveOrUpdate(Faculty adm)
	{
		facrepo.save(adm);
	}
	public Faculty addFaculty(Faculty adm) {
		return facrepo.save(adm);
	}
	
	public void deleteFaculty(int aid) {
		facrepo.deleteById(aid);
	}
	
	public Faculty Login(int aid,String apass)
	{
		return facrepo.findByFidAndFpass(aid, apass);
	}
}
