package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.model.Exams;

public interface ExamRepo extends JpaRepository <Exams,Integer>{

}
