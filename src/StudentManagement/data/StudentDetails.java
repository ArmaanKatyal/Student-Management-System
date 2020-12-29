package StudentManagement.data;

import java.util.ArrayList;
import java.util.List;

import StudentManagement.dto.Course;
import StudentManagement.dto.Student;

public class StudentDetails {
	private static StudentDetails studentDetails = null;
	List<Student> studentList;
	List<Course> courseList;
	
	private StudentDetails() {
		studentList = new ArrayList<>();
		courseList= new ArrayList<>();
	}
	public static StudentDetails getObj() {
		if(studentDetails != null) {
			return studentDetails;
		}
		studentDetails = new StudentDetails();
		return studentDetails;
	}
	public List<Student> getStudentList(){
		return studentList;
	}
	public List<Course> getCourseList(){
		return courseList;
	}
}
