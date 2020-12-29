package StudentManagement.daoimpl;

import java.util.List;

import StudentManagement.dao.StudentDao;
import StudentManagement.data.*;
import StudentManagement.dto.*;

public class StudentDaoImpl implements StudentDao {
	StudentDetails studentDetails;

	@Override
	public Boolean add_student(Student student) {
		return studentDetails.getStudentList().add(student);
	}

	@Override
	public Boolean update_student(Student student) {
		if(getStudentElementIndex(student.getStudent_id())>=0) {
			studentDetails.getStudentList().set(getStudentElementIndex(student.getStudent_id()), student);
			return true;
		}
		return false;
	}

	@Override
	public Boolean delete_student(Integer student_id) {
		if(getStudentElementIndex(student_id)>=0) {
			studentDetails.getStudentList().remove(getStudentElementIndex(student_id));
			return true;
		}
		return false;
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
