package com.p1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="S_ID")
	private int sid;
	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="Password")
	private String pass;
	
//	@OneToMany
//    @JoinColumn(name="STUDENT_ID", referencedColumnName="S_ID")
//	List<Assignment> assignment = new ArrayList<>();
	
//	@OneToMany
//    @JoinColumn(name="STUDENT_ID", referencedColumnName="S_ID")
//	List<Attendance> attendance = new ArrayList<>();
	@ManyToMany(mappedBy ="studt")
	List<Course> cors;
	@ManyToMany(mappedBy ="stud")
	List<Course> cours;
	
	@ManyToMany(mappedBy ="stu")
	List<Course> cors1;
	@ManyToMany(mappedBy ="studnt")
	List<Course> cours1;
	
	public Student() {}

	public Student(int sid, String name, String email, String pass) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.pass = pass;
	}

	public int getSid() {
		return sid;
	}

	public void setSId(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
