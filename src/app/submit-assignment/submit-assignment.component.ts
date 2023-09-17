import { HttpClient } from '@angular/common/http';
import { error } from '@angular/compiler/src/util';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Assignment } from '../assignment';
import { AssignmentService } from '../assignment.service';

@Component({
  selector: 'app-submit-assignment',
  templateUrl: './submit-assignment.component.html',
  styleUrls: ['./submit-assignment.component.css']
})
export class SubmitAssignmentComponent implements OnInit {
  sid:number=0;
  assignments: Assignment=new Assignment();

  constructor(private route: ActivatedRoute, private router: Router,private http:HttpClient, private assignmentservice: AssignmentService) { }

  ngOnInit() {
    this.sid=this.route.snapshot.params['id'];

    this.assignmentservice.getAssignment(this.sid).subscribe(data=>{
      console.log(data)
      this.assignments=data;
    },error=>console.log(error));
  }

  submitAssignment(){
    this.assignmentservice.updateAssignment(this.sid, this.assignments).subscribe(data=>{
      console.log(data);
      this.assignments=new Assignment();
      this.gotoList();
    }, error=>console.log(error));
  }
  onSubmit(){
    this.submitAssignment();
  }
  gotoList(){
    this.router.navigate(['/all/courses']);
  }
}
