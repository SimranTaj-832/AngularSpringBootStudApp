package com.p1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EXAMS")
	
public class Exams {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Slno")
	private int slno;
    @Column(name = "STUDENT_ID")
	private int SId;
    @Column(name = "COURSE_ID")
	private int CId;
    @Column(name="TMARKS")
	private int tmarks;
    @Column(name="MARKS")
	private int marks;
    @Column(name="PERCENTAGE")
    private int percent;
    @Column(name="RESULT")
    private String result;
    
    public Exams() {}

	public Exams(int slno, int sId, int cId, int tmarks, int marks, int percent, String result) {
		super();
		this.slno = slno;
		SId = sId;
		CId = cId;
		this.tmarks = tmarks;
		this.marks = marks;
		this.percent = percent;
		this.result = result;
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

	public int getTmarks() {
		return tmarks;
	}

	public void setTmarks(int tmarks) {
		this.tmarks = tmarks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	    
    
}
