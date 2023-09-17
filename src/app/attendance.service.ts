import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AttendanceService {

  constructor(private http: HttpClient) { }

  getAssignment(sid: number): Observable<any> {
    return this.http.get('http://localhost:8090/api/v1/my/attendance/101');
  }
}
