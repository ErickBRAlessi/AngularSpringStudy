package spring.api.courses.DTO;

import lombok.Builder;
import lombok.Data;
import spring.api.courses.model.ECategoryCourse;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class CourseDTO {

    private long id;

    @NotNull
    private String name;

    @NotNull
    private ECategoryCourse category;

}
