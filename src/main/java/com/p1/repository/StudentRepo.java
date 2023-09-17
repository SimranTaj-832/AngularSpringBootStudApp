package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.model.Student;

public interface StudentRepo extends JpaRepository <Student,Integer> {
 Student findBySidAndPass(int sid, String pass);
}
