package spring.api.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.api.courses.model.Course;
import spring.api.courses.repository.CourseRepository;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;
    private Course course;

    @Override
    public List<Course> findAll(){
        return courseRepository.findAll();
    }

    @Override
    public Course insert(Course course) {
        courseRepository.save(course);
        return course;
    }


}
