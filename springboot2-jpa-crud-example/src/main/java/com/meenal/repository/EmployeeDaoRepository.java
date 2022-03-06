package com.meenal.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meenal.entity.Employee;


@Repository  // spring uses code generation libs   to create impln of the doa interface 
public interface EmployeeDaoRepository extends JpaRepository<Employee, Integer> {

	
	
	}
