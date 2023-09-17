package com.p1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ASSIGNMENTS")
public class Assignment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Slno")
	private int slno;
    @Column(name = "STUDENT_ID")
	private int SId;
    @Column(name = "COURSE_ID")
	private int CId;
	@Column(name="DEADLINE")
	private String deadline;
	@Column(name="COMPLETED_DATE")
	private String compDate;
	@Column(name="GRADE")
	private int grade;
	@Column(name="ASNMT_LINK")
	private String Alink;
	@Column(name="REMARK")
	private String remark;
	
	public Assignment() {}

	public Assignment(int slno,int sId, int cId, String deadline, String compDate, int grade, String alink, String remark) {
		super();
		this.slno = slno;
		SId = sId;
		CId = cId;
		this.deadline = deadline;
		this.compDate = compDate;
		this.grade = grade;
		Alink = alink;
		this.remark = remark;
	}
	
	public int getSlno() {
		return slno;
	}

	public void setSlno(int slno) {
		this.slno = slno;
	}

	public int getSId() {
		return SId;
	}

	public void setSId(int sId) {
		SId = sId;
	}

	public int getCId() {
		return CId;
	}

	public void setCId(int cId) {
		CId = cId;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getCompDate() {
		return compDate;
	}

	public void setCompDate(String compDate) {
		this.compDate = compDate;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAlink() {
		return Alink;
	}

	public void setAlink(String alink) {
		Alink = alink;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	


}
