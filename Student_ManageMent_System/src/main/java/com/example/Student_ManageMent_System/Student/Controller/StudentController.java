package com.example.Student_ManageMent_System.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student_ManageMent_System.Student.Entity.Student;
import com.example.Student_ManageMent_System.Student.Repsitory.StudentRepository;
import com.example.Student_ManageMent_System.Student.Service.StudentService;


@RestController
public class StudentController {

	
	@Autowired
	StudentService studentservice;
	
	@Autowired
	StudentRepository studentrepository;
	
	
	@PostMapping("/Student")
	public Student  createEmployee(@RequestBody Student student)
	{
		return studentservice.createEmployee(student);
	}
	
//	@PostMapping("/Student") 
//	public ResponseEntity<String>  savestudent(@RequestBody List<Student> student )
//	{
//		 studentrepository.saveAll(student);
//		 return ResponseEntity.ok("data saved");
//	}
	
	@DeleteMapping("/Student/{studentid}")
	public String deletestudenteRecordbyId(@PathVariable Long studentid)
	{
		return studentservice.deletestudentRecordById(studentid);
	}
	


	@PutMapping("Student/update/{studentid}")
	public Student updateStudent(@PathVariable Long studentid)
	{
		
		return studentservice.updatestudent(studentid);
	}
	
	@GetMapping("/Student")
	public List<Student> fetchAllEmployee()
	{
		return studentservice.fetchAllEmployee();
	}
	
	
	
	
	
}
