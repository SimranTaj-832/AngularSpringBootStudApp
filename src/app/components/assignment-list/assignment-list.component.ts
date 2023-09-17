import { HttpClient } from '@angular/common/http';
import { error } from '@angular/compiler/src/util';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Assignment } from 'src/app/assignment';
import { AssignmentService } from 'src/app/assignment.service';

@Component({
  selector: 'app-assignment-list',
  templateUrl: './assignment-list.component.html',
  styleUrls: ['./assignment-list.component.css']
})
export class AssignmentListComponent implements OnInit {
  SId:number=0;
  assignments: Assignment=new Assignment();
  

  constructor(private route: ActivatedRoute, private router:Router, private assignmentService: AssignmentService) { }
  

  ngOnInit() {
    this.assignments=new Assignment();
    this.SId=this.route.snapshot.params['sid'];
    this.assignmentService.getAssignment(this.SId).subscribe(data=>{
      console.log(data)
      this.assignments= data;
    },error=>console.log(error));
  }
  list(){
    this.router.navigate(['all/courses'])
  }
  SumbitAsnmt(id:number){
    this.router.navigate(['submit-assignment',id]);
  }

}
