package StudentManagement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import StudentManagement.dao.*;
import StudentManagement.daoimpl.*;
import StudentManagement.dto.*;

public class App {
	
	public static void Main_Menu() {
		System.out.println("");
		System.out.println("1. Student Menu");
		System.out.println("2. Course Menu");
		System.out.println("3. Exit");
		System.out.println("\n");
	}
	public static void Student_Menu() throws IOException {
		System.out.println("---------- Student Menu ---------");
		System.out.println("");
		while(true) {
			System.out.println("1. Add Student");
			System.out.println("2. Update Student");
			System.out.println("3. Delete Student");
			System.out.println("4. Student Detail");
			System.out.println("5. All Students");
			System.out.println("6. Exit to Main Menu");
			System.out.println("\n");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your choice(SM) :");
			int choice = Integer.parseInt(reader.readLine());
			if(choice==1) {
				try {
				System.out.print("Enter Student ID :");
				Integer Stu_id = Integer.parseInt(reader.readLine());
				System.out.print("Enter Student Name :");
				String Stu_name = reader.readLine();
				System.out.print("Enter Student Age :");
				Integer Stu_age = Integer.parseInt(reader.readLine());
				System.out.print("Enter Course ID :");
				Integer Stu_course = Integer.parseInt(reader.readLine());
				CourseDao courseDao = new CourseDaoImpl();
				StudentDao studentDao = new StudentDaoImpl();
				studentDao.add_student(new Student(Stu_id,Stu_name,Stu_age,courseDao.get_course(Stu_course)));
				} catch(Exception e) {
					System.out.println(" Process Unsuccessful... Try Again.");
				}
				
			}else if (choice==2) {
				try {
					System.out.print("Enter Student ID :");
					Integer Stu_id = Integer.parseInt(reader.readLine());
					System.out.print("Enter Student Name :");
					String Stu_name = reader.readLine();
					System.out.print("Enter Student Age :");
					Integer Stu_age = Integer.parseInt(reader.readLine());
					System.out.print("Enter Course ID :");
					Integer Stu_course = Integer.parseInt(reader.readLine());
					CourseDao courseDao = new CourseDaoImpl();
					StudentDao studentDao = new StudentDaoImpl();
					studentDao.update_student(new Student(Stu_id,Stu_name,Stu_age,courseDao.get_course(Stu_course)));
				} catch(Exception e) {
					System.out.println(" Process Unsuccessful... Try Again.");
				}
				
			}else if (choice==3) {
				try {
					System.out.print("Enter Student ID :");
					Integer Stu_id = Integer.parseInt(reader.readLine());
					StudentDao studentDao = new StudentDaoImpl();
					studentDao.delete_student(Stu_id);
				} catch(Exception e) {
					System.out.println(" Process Unsuccessful... Try Again.");
				}
				
			}else if (choice == 4) {
				try {
					System.out.print("Enter Student ID :");
					Integer Stu_id = Integer.parseInt(reader.readLine());
					StudentDao studentDao = new StudentDaoImpl();
					System.out.println(studentDao.getStudent(Stu_id));
				}catch(Exception e) {
					System.out.println(" Process Unsuccessful... Try Again.");
				}
				
			}else if (choice == 5) {
				try {
					StudentDao studentDao = new StudentDaoImpl();
					System.out.println(studentDao.getStudents());
				}catch(Exception e) {
					System.out.println(" Process Unsuccessful... Try Again.");
				}
				
			}else if (choice == 6) {
				break;
			}else {
				System.out.println("Please enter a valid choice ... ");
			}
		}
	}
	
	public static void Course_Menu() throws IOException {
		System.out.println("---------- Course Menu ----------");
		System.out.println();
		while(true) {
			System.out.println("1. Add Student");
			System.out.println("2. Update Student");
			System.out.println("3. Delete Student");
			System.out.println("4. Student Detail");
			System.out.println("5. All Students");
			System.out.println("6. Exit to Main Menu");
			System.out.println("\n");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter your choice(CM) :");
			int choice = Integer.parseInt(reader.readLine());
			if(choice == 1){
				try {
					System.out.print("Enter Course ID :");
					int Course_id = Integer.parseInt(reader.readLine());
					System.out.print("Enter Course Name :");
					String Course_name = reader.readLine();
					System.out.print("Enter Course Fee");
					Double Course_fee = Double.parseDouble(reader.readLine());

				}catch(Exception e){
					System.out.println(" Process Unsuccessful... Try Again.");
				}
			}else if(choice == 2){

			}else if(choice == 3){

			}else if(choice == 4){

			}else if(choice == 5){

			}else if(choice ==6){
				break;
			}else{

			}

		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println("---------- Welcome to Student Management -----------");
		System.out.println("                             Made by : Your Name");
		while(true) {
			Main_Menu();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter your choice :");
			int choice = Integer.parseInt(reader.readLine());
			if(choice==1) {
				Student_Menu();
			}else if (choice == 2) {
				Course_Menu();
			}else if (choice == 3) {
				break;
			}else {
				System.out.println("Please enter a valid choice ... ");
			}
			
		}
	}

}
