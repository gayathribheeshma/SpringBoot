package controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import model.EmployeeListVO;

@RestController
@CrossOrigin
public class EmployeeController {
	
	@GetMapping(value = "/test")
	public EmployeeListVO  getAllEmployeeslIst(){
		System.out.println("inside controller ....");
		
		EmployeeListVO  employeelist = new EmployeeListVO();
	
	Employee emp1 = new Employee(1, "Gayathri", "Veeroju", "abc@gmail.com");
	Employee emp2 = new Employee(1, "kruthika", "medoju", "mk@gmail.com");
	Employee emp3 = new Employee(1, "taruni", "M", "mpt@gmail.com");
	Employee emp4 = new Employee(1, "cHanikya", "Mp", "canu@gmail.com");
	
	employeelist.getEmployees().add(emp1);
	employeelist.getEmployees().add(emp2);
	employeelist.getEmployees().add(emp3);
	employeelist.getEmployees().add(emp4);
	
	System.out.println("get employees :..."+employeelist.getEmployees());
	return employeelist;
	}
	
}
