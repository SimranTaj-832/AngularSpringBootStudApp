package com.p1.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.model.*;
import com.p1.repository.*;
@Service
public class AssignmentService {
	@Autowired
	AssignmentRepo asnmtrepo;
	
	public List<Assignment> getAllAsnmt(){
		List<Assignment> asnmt=new ArrayList<Assignment>();
		asnmtrepo.findAll().forEach(attn->asnmt.add(attn));
		return asnmt;
	}
	public void saveOrUpdate(Assignment a)
	{
		asnmtrepo.save(a);
	}
	public Assignment getAsnmtById(int id) {
		return asnmtrepo.findById(id).get();
	}
	public void update(Assignment ast)
	{
		Assignment astd=getAsnmtById(ast.getSlno());
		astd.setAlink(ast.getAlink());
		astd.setCompDate(ast.getCompDate());
		asnmtrepo.save(astd);
	}

}
