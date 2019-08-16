package com.infosys.infytel.studentdetails.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.infosys.infytel.studentdetails.dto.StudentDTO;
import com.infosys.infytel.studentdetails.entity.Student;
import com.infosys.infytel.studentdetails.repository.StudentDetailsReposotiry;
import com.infosys.infytel.studentdetails.service.StudentDetailsService;



@RestController
@CrossOrigin
public class StudentDetailsController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentDetailsService studentDetailsService;
	@Autowired
	StudentDetailsReposotiry studentDetailsReposotiry;
	//Get All Details
	@GetMapping(value = "/students/{number}", produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE})
	public List<StudentDTO> getStudentDetails(@PathVariable int number) {
		

		logger.info("Student dEtails{}", number);

		return studentDetailsService.getStudentDetails(number);
	}
	
	//save student details to DB
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		Student savedStudent = studentDetailsReposotiry.save(student);

		//URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				//.buildAndExpand(savedStudent.getId()).toUri();

		//return ResponseEntity.created(location).build();
		return savedStudent;

	}

	//GET ALL STUDENT DETAILS
	
	//@RequestMapping(value="/students1",produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE})
	@GetMapping(value ="/allStudents" ,produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE})
	public List<Student> getAllStudents() {
	System.out.println("inside all students...");
	    return studentDetailsReposotiry.findAll();
	}
	
	@DeleteMapping("/deleteStudent/{number}")
	public void deleteStudent(@PathVariable long number) {
		logger.info(" delete Student Details{}", number);
		System.out.println("inside delete method...");
		studentDetailsReposotiry.deleteById(number);
	}
}
