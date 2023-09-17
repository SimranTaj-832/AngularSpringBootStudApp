package com.p1.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.model.*;
import com.p1.repository.*;
@Service
public class AttendanceService {
	@Autowired
	AttendanceRepo attnrepo;

	public List<Attendance> getAllAttends(){
		List<Attendance> att=new ArrayList<Attendance>();
		attnrepo.findAll().forEach(attn->att.add(attn));
		return att;
	}
	public void saveOrUpdate(Attendance attend)
	{
		attnrepo.save(attend);
	}
	public Attendance getAttnById(int id) {
		return attnrepo.findById(id).get();
	}

}
