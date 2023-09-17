package com.p1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.model.Exams;
import com.p1.repository.ExamRepo;

@Service
public class ExamsService {
	@Autowired
	ExamRepo exrepo;
	
	public List<Exams> getAllAsnmt(){
		List<Exams> asnmt=new ArrayList<Exams>();
		exrepo.findAll().forEach(attn->asnmt.add(attn));
		return asnmt;
	}
	public void saveOrUpdate(Exams a)
	{
		exrepo.save(a);
	}
	public Exams getAsnmtById(int id) {
		return exrepo.findById(id).get();
	}
	
}
