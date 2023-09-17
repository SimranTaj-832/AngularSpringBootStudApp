package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.model.Course;

public interface CourseRepo extends JpaRepository <Course,Integer> {

}