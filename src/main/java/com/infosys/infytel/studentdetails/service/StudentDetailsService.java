package com.infosys.infytel.studentdetails.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.infosys.infytel.studentdetails.dto.StudentDTO;
import com.infosys.infytel.studentdetails.entity.Student;
import com.infosys.infytel.studentdetails.repository.StudentDetailsReposotiry;

@Service
public class StudentDetailsService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentDetailsReposotiry studentDetailsRepo;

	// Fetches call details of a specific customer
	public List<StudentDTO> getStudentDetails(@PathVariable int id) {

		logger.info("Studentdetails request for customer {}", id);

		List<Student> studentDetails = studentDetailsRepo.findAllById(id);
		List<StudentDTO> studentDTO = new ArrayList<StudentDTO>();

		for (Student st : studentDetails) {
			studentDTO.add(StudentDTO.valueOf(st));
		}
		logger.info("Student details : {}", studentDetails);

		return studentDTO;
	}
}
