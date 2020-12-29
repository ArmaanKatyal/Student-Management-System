package StudentManagement.daoimpl;

import java.util.List;

import StudentManagement.dao.*;
import StudentManagement.data.*;
import StudentManagement.dto.*;

public class CourseDaoImpl implements CourseDao{
	StudentDetails studentDetails;
	public CourseDaoImpl() {
		studentDetails = StudentDetails.getObj();
	}
	@Override
	public Boolean add_course(Course course) {
		return studentDetails.getCourseList().add(course);
	}
	@Override
	public Boolean update_course(Course course) {
		if(getCourseElementIndex(course.getCourse_id())>=0) {
			studentDetails.getCourseList().set(getCourseElementIndex(course.getCourse_id()), course);
			return true;
		}
		return false;
	}
	@Override
	public Boolean delete_course(Integer course_id) {
		if(getCourseElementIndex(course_id)>=0) {
		studentDetails.getCourseList().remove(getCourseElementIndex(course_id));
		return true;
		}
		return false;
	}

	@Override
	public Course get_course(Integer course_id) {
		return studentDetails.getCourseList().get(getCourseElementIndex(course_id));
	}

	@Override
	public int getCourseElementIndex(Integer course_id) {
		for(Course c: studentDetails.getCourseList()) {
			if(c.getCourse_id().equals(course_id)) {
				return studentDetails.getCourseList().indexOf(c);
			}
		}
		return -1;
	}

	@Override
	public List<Course> getCourses() {
		return studentDetails.getCourseList();
	}
	
}
