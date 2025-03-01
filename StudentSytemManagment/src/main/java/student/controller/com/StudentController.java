package student.controller.com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import student.entity.Student;
import student.ervice.com.StudentService;


@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/id/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping("/add")
	public boolean createEntry(@RequestBody Student student) {
		studentService.updateStudent(student);
		return true;
	}

	@PutMapping("id/{id}")
	public Student updateStudentById(@PathVariable long id, @RequestBody Student updatedStudent) {

		Student existingStudent = studentService.getStudentById(id);

		if (existingStudent != null) {
			existingStudent.setFirstname(updatedStudent.getFirstname());
			existingStudent.setFirstname(updatedStudent.getFirstname());
			existingStudent.setAddress(updatedStudent.getAddress());

			Student savedStudent = studentService.updateStudent(existingStudent);
			return savedStudent;
		}

		return null;

	}

	@DeleteMapping("id/{id}")
	public void deleteStudentById(@PathVariable Long id) {
		studentService.deleteStudentById(id);
	}

}