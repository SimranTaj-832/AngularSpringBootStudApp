import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Attendance } from 'src/app/attendance';
import { AttendanceService } from 'src/app/attendance.service';

@Component({
  selector: 'app-attendance-list',
  templateUrl: './attendance-list.component.html',
  styleUrls: ['./attendance-list.component.css']
})
export class AttendanceListComponent implements OnInit {
  SId:number=0;
  assignments: Attendance=new Attendance();
  

  constructor(private route: ActivatedRoute, private router:Router, private attendanceService: AttendanceService) { }
  

  ngOnInit() {
    this.assignments=new Attendance();
    this.SId=this.route.snapshot.params['sid'];
    this.attendanceService.getAssignment(this.SId).subscribe(data=>{
      console.log(data)
      this.assignments= data;
    },error=>console.log(error));
  }
  
}
