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
@Table(name="ATTENDANCE")
public class Attendance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Slno")
	private int slno;
    @Column(name ="STUDENT_ID")
	private int SId;
    @Column(name ="COURSE_ID")
	private int CId;
	@Column(name="TOTAL_CLASSES")
	private int tcls;
	@Column(name="PRESENT")
	private int present;
	
	public Attendance() {}

	public Attendance(int slno, int sId, int cId, int tcls, int present) {
		super();
		this.slno = slno;
		SId = sId;
		CId = cId;
		this.tcls = tcls;
		this.present = present;
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

	public int getTcls() {
		return tcls;
	}

	public void setTcls(int tcls) {
		this.tcls = tcls;
	}

	public int getPresent() {
		return present;
	}

	public void setPresent(int present) {
		this.present = present;
	}

		
}
