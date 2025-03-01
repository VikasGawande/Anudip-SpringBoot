package student.service.implentaion.com;

import java.util.List;

import org.springframework.stereotype.Service;

import student.entity.Student;
import student.ervice.com.StudentService;
import student.repository.StudentRepo;

@Service
public class StudentServImp implements StudentService {

	private StudentRepo studentRepo;
	
	public StudentServImp(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		 studentRepo.deleteById(id);
		
	}
	
}
