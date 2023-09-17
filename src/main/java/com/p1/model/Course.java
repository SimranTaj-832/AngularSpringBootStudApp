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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Transactional


@Table(name="Course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="C_ID")
	private int CId;
	@Column(name="CNAME")
	private String name;
	@Column(name="C_DURATION")
	private String duration;
	@Column(name="TOTAL_MARKS")
	private int totalMarks;
	//@Column(name="FACULTY_ID")
	//@OneToOne(cascade=CascadeType.ALL)
    //@JoinColumn(name = "FACULTY_ID")
//	@Column(name = "FACULTY_ID", nullable=false)
//	private int fid;
	
//	@ManyToOne(optional=true)
//	@JoinColumn(name = "FACULTY_ID",insertable=false, updatable=false)
	@ManyToOne
	@JoinColumn(name = "FACULTY_ID")
	private Faculty fac;
	
//	@OneToMany(cascade=CascadeType.ALL)
//    @JoinColumn(name="COURSE_ID", referencedColumnName="C_ID")
//	List<Assignment> assignment = new ArrayList<>();
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="ASSIGNMENTS", joinColumns=
    {@JoinColumn(name="COURSE_ID")}, inverseJoinColumns={@JoinColumn(name="STUDENT_ID")})
	List<Student> studt;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="ATTENDANCE", joinColumns=
    {@JoinColumn(name="COURSE_ID")}, inverseJoinColumns={@JoinColumn(name="STUDENT_ID")})
	List<Student> stud;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="EXAMS", joinColumns=
    {@JoinColumn(name="COURSE_ID")}, inverseJoinColumns={@JoinColumn(name="STUDENT_ID")})
	List<Student> stu;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="EXAMS", joinColumns=
    {@JoinColumn(name="COURSE_ID")}, inverseJoinColumns={@JoinColumn(name="STUDENT_ID")})
	List<Student> studnt;
	
	public Course() {}

	public Course(int cId, String name, String duration, int totalMarks, Faculty fac, List<Student> studt,
			List<Student> stud) {
		super();
		CId = cId;
		this.name = name;
		this.duration = duration;
		this.totalMarks = totalMarks;
		this.fac = fac;
		this.studt = studt;
		this.stud = stud;
	}

	public int getCId() {
		return CId;
	}

	public void setCId(int cId) {
		CId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Faculty getFac() {
		return fac;
	}

	public void setFac(Faculty fac) {
		this.fac = fac;
	}

	public List<Student> getStudt() {
		return studt;
	}

	public void setStudt(List<Student> studt) {
		this.studt = studt;
	}

	public List<Student> getStud() {
		return stud;
	}

	public void setStud(List<Student> stud) {
		this.stud = stud;
	}
	

	

}
