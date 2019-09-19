package com.infosys.infytel.studentdetails.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddToDB {
	
	static Logger logger = LoggerFactory.getLogger("Employee.class");

	public static void main(String[] args) {
	
		logger.info("Adding employee details{}");	
		
Employee e = new Employee();
		
		e.setEmpId(1234);
		e.setfName("geetha");
		e.setlName("govindam");
		
		System.out.println("Data added to table ..");
	
	}

}
