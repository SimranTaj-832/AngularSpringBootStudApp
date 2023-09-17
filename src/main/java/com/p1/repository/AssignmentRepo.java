package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.model.Assignment;

public interface AssignmentRepo extends JpaRepository <Assignment,Integer>{

}
