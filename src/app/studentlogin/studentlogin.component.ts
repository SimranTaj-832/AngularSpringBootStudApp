import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginstudentService } from '../loginstudent.service';
import { Student } from '../student';

@Component({
  selector: 'app-studentlogin',
  templateUrl: './studentlogin.component.html',
  styleUrls: ['./studentlogin.component.css']
})
export class StudentloginComponent implements OnInit {

  student:Student=new Student();

  constructor(private loginservice:LoginstudentService, private router:Router) { }

  ngOnInit(): void {
  }
  studentlogin(){
    this.student=new Student();
    console.log(this.student);
    this.navbar(this.student.sid);
    
    this.loginservice.loginstudent(this.student).subscribe(data=>{ alert("Login Successfully")},error=>alert("Please Enter valid ID and Password"));
  }
  navbar(sid:number){
    this.router.navigate(['navbar',sid]);
  }

  
}
