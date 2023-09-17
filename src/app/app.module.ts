import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { StudListComponent } from './components/stud-list/stud-list.component';
import { NavbarComponent } from './navbar/navbar.component';
import { AttendanceListComponent } from './components/attendance-list/attendance-list.component';
import { AssignmentListComponent } from './components/assignment-list/assignment-list.component';
import { SubmitAssignmentComponent } from './submit-assignment/submit-assignment.component';
import { CoursesComponent } from './courses/courses.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { FormsModule } from '@angular/forms';
import { ExamsComponent } from './exams/exams.component';

@NgModule({
  declarations: [
    AppComponent,
    StudListComponent,
    NavbarComponent,
    AttendanceListComponent,
    AssignmentListComponent,
    SubmitAssignmentComponent,
    CoursesComponent,
    StudentloginComponent,
    ExamsComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
