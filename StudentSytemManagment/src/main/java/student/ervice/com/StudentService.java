package student.ervice.com;

import java.util.List;

import student.entity.Student;

public interface StudentService {
	
	//List of student
	List<Student> getAllStudents();
	
	//Create save student method
	Student saveStudent(Student student);
	
	
	//using 2 we get id and we can update it
	Student getStudentById(Long id);
	
	//update Student
	Student updateStudent(Student student);
	
	//student delete
	void deleteStudentById(Long id);
	
	

}
