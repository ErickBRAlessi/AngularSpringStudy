package spring.api.courses.service;

import spring.api.courses.model.Course;

import java.util.List;

public interface ICourseService {

    public List<Course> findAll();

    public Course insert(Course course);
}
