import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css']
})
export class CoursesComponent implements OnInit {
  courses:any;
  constructor(private http:HttpClient) { }

  ngOnInit() {
    let response=this.http.get("http://localhost:8090/api/v1/all/courses");
    response.subscribe((data)=>this.courses=data);
  }

}
