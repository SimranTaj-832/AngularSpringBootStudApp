package com.p1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {

	public Admin(int aid, String aname, String apass) {
		
		this.aid = aid;
		this.aname = aname;
		this.apass = apass;
	}

	@Id
	@Column(name="ID")
	private int aid;
	
	@Column(name="Name")
	private String aname;
	
	@Column(name="Password")
	private String apass;
	
	public Admin() {}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApass() {
		return apass;
	}

	public void setApass(String apass) {
		this.apass = apass;
	}

	
}
