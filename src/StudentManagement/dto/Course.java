package StudentManagement.dto;

public class Course {
	Integer course_id;
	String course_name;
	Double course_fee;
	public Course() {
		
	}
	public Course(Integer course_id, String course_name, Double course_fee) {
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_fee = course_fee;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public Double getCourse_fee() {
		return course_fee;
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", course_fee=" + course_fee + "]";
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public void setCourse_fee(Double course_fee) {
		this.course_fee = course_fee;
	}
	
}
