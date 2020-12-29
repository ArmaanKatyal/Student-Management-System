package StudentManagement.dto;

public class Student {
	Integer student_id;
	String student_name;
	Integer student_age;
	Course course;

	public Student(Integer student_id, String student_name, Integer student_age, Course course) {
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_age = student_age;
		this.course = course;
	}
	public Integer getStudent_id() {
		return student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_age=" + student_age
				+ ", course=" + course + "]";
	}
	public Integer getStudent_age() {
		return student_age;
	}
	public Course getCourse() {
		return course;
	}
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public void setStudent_age(Integer student_age) {
		this.student_age = student_age;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
