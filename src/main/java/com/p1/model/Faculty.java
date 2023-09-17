package com.p1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="faculty")
public class Faculty {

	public Faculty(int fid, String fname, String fpass) {
		
		this.fid = fid;
		this.fname = fname;
		this.fpass = fpass;
	}


	@Id
	@Column(name="ID")
	private int fid;
	
	@Column(name="Name")
	private String fname;
	
	@Column(name="Password")
	private String fpass;
	
	
	public Faculty() {}
	

	

	public int getFid() {
		return fid;
	}


	public void setFid(int fid) {
		this.fid = fid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getFpass() {
		return fpass;
	}


	public void setFpass(String fpass) {
		this.fpass = fpass;
	}


	

//	public List<Course> getCours() {
//		return cours;
//	}
//
//	public void setCours(List<Course> cours) {
//		this.cours = cours;
//	}

	
}
