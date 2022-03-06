package com.meenal.services;

import java.util.List;

import com.meenal.entity.Employee;

public interface EmployeeService {
	  
	
	   // public List<Employee> getEmployees();
	
		public List<Integer> getEmployees();
		
		//public  int calcMonthlySal();
		
		public Employee getEmpDetails(int id); 
	    
	 /*   public Employee addNewEmployee(Employee emp) ;
	    
	    public Employee updateEmployee(Employee emp) ;
	    public String  deleteEmployeeById(int empid) ;
	  
	    //public void  deleteEmployeeById(int empid) ;
	   
	    public void deleteAllEmployees();*/

}
