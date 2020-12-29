package StudentManagement.dao;

import java.util.List;

import StudentManagement.dto.Student;

public interface StudentDao {
	void add_student(Student student);
	void update_student(Student student);
	void delete_student(Integer student_id);
	
	Student getStudent(Integer student_id);
	List<Student> getStudents();
	int getStudentElementIndex(Integer student_id);
}
