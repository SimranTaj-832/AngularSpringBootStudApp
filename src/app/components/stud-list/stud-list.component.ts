import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-stud-list',
  templateUrl: './stud-list.component.html',
  styleUrls: ['./stud-list.component.css']
})
export class StudListComponent implements OnInit {
  student: any;
  

  constructor(private http:HttpClient, private route: ActivatedRoute) { }

  ngOnInit() {
    this.student={sid:this.route.snapshot.params['sid']};
    let response=this.http.get("http://localhost:8090/api/v1/student/101");
    response.subscribe((data)=>this.student=data);
  }
  

}
