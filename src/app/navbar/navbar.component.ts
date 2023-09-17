import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Student } from '../student';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  sid:number=0;
  student:Student=new Student();

  constructor(private route: ActivatedRoute, private router: Router,private http:HttpClient) { }

  ngOnInit(): void {
    this.sid=this.route.snapshot.params['sid'];
    
  }
  stud(){
    this.profile(this.student.sid);
  }
  asnmt(){
    this.assignments(this.student.sid);
  }
  attn(){
    this.attendance(this.student.sid);
  }
  assignments(sid:number){
    this.router.navigate(['assignment-list',sid]);
  }
  attendance(sid:number){
    this.router.navigate(['attendance-list',sid]);
  }
  profile(sid:number){
    this.router.navigate(['stud-list',sid]);
  }
}
