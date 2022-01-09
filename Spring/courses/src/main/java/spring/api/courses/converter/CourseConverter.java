package spring.api.courses.converter;


import spring.api.courses.DTO.CourseDTO;
import spring.api.courses.model.Course;

public abstract class CourseConverter {

    public static CourseDTO convert(Course course){
            return CourseDTO
                    .builder()
                    .id(course.getId())
                    .name(course.getName())
                    .category(course.getCategory())
                    .build();
    }

    public static Course convert(CourseDTO courseDTO){
        return Course
                .builder()
                .id(courseDTO.getId())
                .name(courseDTO.getName())
                .category(courseDTO.getCategory())
                .build();
    }





}
