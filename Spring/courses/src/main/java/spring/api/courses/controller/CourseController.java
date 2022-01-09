package spring.api.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import spring.api.courses.DTO.CourseDTO;
import spring.api.courses.converter.CourseConverter;
import spring.api.courses.model.Course;
import spring.api.courses.service.ICourseService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Controller()
public class CourseController {

    @Autowired
    private ICourseService courseService;

    @GetMapping("/courses")
    public ResponseEntity<List<CourseDTO>> getAllCourses(){
        return ResponseEntity.ok().body(courseService.findAll().stream().map(CourseConverter::convert).collect(Collectors.toList()));
    }

    @PostMapping("/courses")
    public ResponseEntity<CourseDTO> insertCourse(@Valid @RequestBody CourseDTO courseDTO){
        Course course = courseService.insert(CourseConverter.convert(courseDTO));
        return ResponseEntity.ok().body(CourseConverter.convert(course));
    }

}
