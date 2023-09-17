package com.p1.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.model.*;
import com.p1.repository.*;
@Service
public class StudentService {
	@Autowired
	StudentRepo studrepo;

	public List<Student> getAllStudents(){
		List<Student> cst=new ArrayList<Student>();
		studrepo.findAll().forEach(cus->cst.add(cus));
		return cst;
	}
	public void deleteStudent(int id)
	{
		studrepo.deleteById(id);
	}
	public Student addStudent(Student adm) {
		return studrepo.save(adm);
	}

	public void saveOrUpdate(Student adm)
	{
		studrepo.save(adm);
	}
	public Student getStudentById(int id) {
		return studrepo.findById(id).get();
	}
	public Student login(int sid, String pass) {
//		Student stud=studrepo.findBySidAndPass(sid, pass);
		return studrepo.findBySidAndPass(sid, pass);
	}
}
