import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AssignmentService {

  private baseUrl = 'http://localhost:8080/springboot-crud-rest/api/v1/assignment/submit';

  constructor(private http: HttpClient) { }

  getAssignment(sid: number): Observable<any> {
    return this.http.get('http://localhost:8090/api/v1/my/assignment/101');
  }

  updateAssignment(SId: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}`, value);
  }
}
