import { CoursesService } from './../../services/courses.service';
import { Course } from './../../model/course';
import { Component } from '@angular/core';
import {MatTableDataSource} from '@angular/material/table';


const ELEMENT_DATA: Course[] = [{'_id': 1, 'name': 'Angular', 'category': 'Front-end' }];


@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent {

  displayedColumns: string[] = ['_id', 'name', 'category'];
  dataSource = new MatTableDataSource(this.coursesService.list());

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
 //   console.log((event.target as HTMLInputElement).value);
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

  constructor(private coursesService: CoursesService) {

  }

}
