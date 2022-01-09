import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatInputModule } from '@angular/material/input';
import { MatTableModule } from '@angular/material/table';

import { CoursesRoutingModule } from './courses-routing.module';
import { CoursesComponent } from './courses/courses.component';
import { ListComponent } from './courses/list/list.component';


@NgModule({
  declarations: [
    CoursesComponent,
    ListComponent
  ],
  imports: [
    CommonModule,
    CoursesRoutingModule,
    MatInputModule,
    MatTableModule
  ]
})
export class CoursesModule { }
