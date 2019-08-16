package com.infosys.infytel.studentdetails.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.infosys.infytel.studentdetails.entity.Student;

public interface StudentDetailsReposotiry extends JpaRepository<Student,Long> {

	//Optional<Student> findById(int id);

	List<Student> findAllById(int id);
	// void deleteById(long id);
	
	//@Override
	//default void deleteById(int id) {
		// TODO Auto-generated method stub
		
	//}
}
