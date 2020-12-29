package StudentManagement.daoimpl;

import java.util.List;

import StudentManagement.dao.StudentDao;
import StudentManagement.data.*;
import StudentManagement.dto.*;

public class StudentDaoImpl implements StudentDao {
	StudentDetails studentDetails;
	public StudentDaoImpl() {
		studentDetails = StudentDetails.getObj();
	}
	@Override
	public void add_student(Student student) {
		studentDetails.getStudentList().add(student);
	}

	@Override
	public void update_student(Student student) {
		if(getStudentElementIndex(student.getStudent_id())>=0) {
			studentDetails.getStudentList().set(getStudentElementIndex(student.getStudent_id()), student);
		}
	}

	@Override
	public void delete_student(Integer student_id) {
		if(getStudentElementIndex(student_id)>=0) {
			studentDetails.getStudentList().remove(getStudentElementIndex(student_id));
		}
	}

	@Override
	public Student getStudent(Integer student_id) {
		return studentDetails.getStudentList().get(student_id);
	}

	@Override
	public List<Student> getStudents() {
		return studentDetails.getStudentList();
	}
	
	@Override
	public int getStudentElementIndex(Integer student_id) {
		for(Student s: studentDetails.getStudentList()) {
			if(s.getStudent_id().equals(student_id)) {
				return studentDetails.getStudentList().indexOf(s);
			}
		}
		return -1;
	}
	
}
