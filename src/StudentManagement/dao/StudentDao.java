package StudentManagement.dao;

import java.util.List;

import StudentManagement.dto.Student;

public interface StudentDao {
	Boolean add_student(Student student);
	Boolean update_student(Student student);
	Boolean delete_student(Integer student_id);
	
	Student getStudent(Integer student_id);
	List<Student> getStudents();
	int getStudentElementIndex(Integer student_id);
}
