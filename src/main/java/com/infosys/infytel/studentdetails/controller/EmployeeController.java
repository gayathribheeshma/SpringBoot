package com.infosys.infytel.studentdetails.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.infytel.studentdetails.entity.Employee;
import com.infosys.infytel.studentdetails.entity.Student;
import com.infosys.infytel.studentdetails.repository.EmployeeRepository;

@RestController
@RequestMapping("/")
public class EmployeeController {
	@Autowired
	EmployeeRepository  employeeRepository;
	
	@PostMapping("/employees")
	//@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Employee createEmployee(@RequestBody Employee employee ) {
		
//		Employee emp = new Employee();
//		emp.setEmpId(174858);
//		emp.setfName("Gayathri");
//		emp.setlName("veeroju");

		Employee savedEmployee = employeeRepository.save(employee);
		
		
		//URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				//.buildAndExpand(savedStudent.getId()).toUri();

		//return ResponseEntity.created(location).build();
		return savedEmployee;

	}
	
	
	@PutMapping("/putemployees/{id}")
	public Employee UpdateEmployee( @PathVariable(value = "id") Long empId,  @Valid @RequestBody Employee employee) {
		
	Employee emp = new Employee();
		emp.setEmpId(17488);
		emp.setfName("rama");
		emp.setlName("veeroju");

		Employee savedEmployee = employeeRepository.save(employee);
		
		
		//URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				//.buildAndExpand(savedStudent.getId()).toUri();

		//return ResponseEntity.created(location).build();
		return savedEmployee;

	}


}
