package Course;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CourseRepository {
    private final List<Course> courses = new ArrayList<>();
    public CourseRepository() {
        courses.add(
                new Course(1L, "Advanced Web Development", 30)
        );
        courses.add(
                new Course(2L, "Database Systems", 25)
        );
    }
    public List<Course> findAll() {
        return courses;
    }
    public Course findById(Long id) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }
}
