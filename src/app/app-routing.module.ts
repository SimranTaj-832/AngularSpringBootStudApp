import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AssignmentService } from './assignment.service';
import { AssignmentListComponent } from './components/assignment-list/assignment-list.component';
import { AttendanceListComponent } from './components/attendance-list/attendance-list.component';
import { StudListComponent } from './components/stud-list/stud-list.component';
import { SubmitAssignmentComponent } from './submit-assignment/submit-assignment.component';

const routes: Routes = [
  { path: 'my/assignment/:sid', component:AssignmentListComponent},
  { path: 'my/attendance/:sid', component:AttendanceListComponent },
  { path: 'student/:sid', component:StudListComponent },
  { path: 'submit-assignment/:id', component:SubmitAssignmentComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
