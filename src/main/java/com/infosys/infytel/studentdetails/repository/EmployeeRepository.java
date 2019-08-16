package com.infosys.infytel.studentdetails.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.studentdetails.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

	
}
