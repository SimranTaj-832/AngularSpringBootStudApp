import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class LoginstudentService {
  baseUrl="http://localhost:8090/api/v1/student/login";

  constructor(private httpClient:HttpClient) { }
  loginstudent(student:Student):Observable<object>{
    console.log(student);
    return this.httpClient.post('${this.baseUrl}',student);
  }
}
