package spring.api.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import spring.api.courses.model.Course;
import spring.api.courses.model.ECategoryCourse;
import spring.api.courses.repository.CourseRepository;
import spring.api.courses.service.CourseService;

@SpringBootApplication
public class CoursesApplication {

	@Autowired
	private CourseService courseService;

	public static void main(String[] args) {
		SpringApplication.run(CoursesApplication.class, args);
	}

	@Bean
	public void initializer(){
		System.out.println("inicializando");
		Course c = Course
				.builder()
				.name("Angular")
				.category(ECategoryCourse.FRONTEND)
				.build();
		courseService.insert(c);
		System.out.println(courseService.findAll());
	}

}
