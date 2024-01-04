package com.example.Student_ManageMent_System.Student.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student_ManageMent_System.Student.Entity.Student;
import com.example.Student_ManageMent_System.Student.Repsitory.StudentRepository;

@Service
public class StudentService {

	
	@Autowired
	StudentRepository studentrepository;
	
	
	public Student createEmployee(Student student) {
		
		return studentrepository.save(student);
	}
	
	
	public String deletestudentRecordById(Long studentid) {
		
		Optional<Student> stud=studentrepository.findById(studentid);
		//if(studentrepository.findById(id).get()!=null)
		if(stud.isPresent())
		{
			studentrepository.deleteById(studentid);
			return "record successfully deleted";
		}
		else
		{
			return"record not found.. or deleted";
		}
	}


	public List<Student> fetchAllEmployee() {
		
		return studentrepository.findAll() ;
	}



	public Student updatestudent(Long studentid) {
		
		Student stud=studentrepository.findById(studentid).get();
		stud.setEmail("komi@gmail.com");
		stud.setCollege_name("University");
		studentrepository.save(stud);
		return stud;
	
	}

	
	
}
