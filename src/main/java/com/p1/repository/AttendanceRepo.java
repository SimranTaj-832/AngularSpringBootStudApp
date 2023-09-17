package com.p1.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.p1.model.Attendance;

public interface AttendanceRepo extends JpaRepository <Attendance, Integer>{

}
