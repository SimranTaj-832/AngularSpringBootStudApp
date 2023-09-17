package com.p1.repository;

import org.springframework.data.repository.CrudRepository;
import com.p1.model.Faculty;


public interface FacultyRepo extends CrudRepository <Faculty,Integer> {

	Faculty findByFidAndFpass(int fid,String fpass);
}
