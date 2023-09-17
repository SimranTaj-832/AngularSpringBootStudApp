package com.p1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.p1.model.Admin;

public interface AdminRepo extends JpaRepository <Admin,Integer>{

	Admin findByAidAndApass(int aid,String apass);
}
