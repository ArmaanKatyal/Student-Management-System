package StudentManagement.dao;

import java.util.List;

import StudentManagement.dto.Course;

public interface CourseDao {
	Boolean add_course(Course course);
	Boolean update_course(Course course);
	Boolean delete_course(Integer course_id);
	
	Course get_course(Integer course_id);
	int getCourseElementIndex(Integer course_id);
	List<Course> getCourses();
}
