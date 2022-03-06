package com.meenal.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

//import com.meenal.entity.EmpTds;
import com.meenal.entity.Employee;
//import com.meenal.repository.EmpTdsDaoRepository;
import com.meenal.repository.EmployeeDaoRepository;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDaoRepository dao;
//	@Autowired
	//private EmpTdsDaoRepository daoTds;

	@Override
	public List<Integer> getEmployees() {
		System.out.println("inside Services");
		List<Employee> empList = dao.findAll();
		List<Integer> ids = empList.stream().map(Entity -> Entity.getId()).collect(Collectors.toList());
		System.out.println(ids);
		return ids;
	}

	@Override
	public Employee getEmpDetails(int id) {
		// Session session = sessionFactory.openSession(); - Hibernate
		Optional<Employee> empWrap = dao.findById(id); // - hibernate method
		return empWrap.get();
	}
/*
	@Override
	public Employee addNewEmployee(Employee emp) {
		return dao.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return dao.save(emp);
	}

	@Override
	public String deleteEmployeeById(int empid) {		
		dao.deleteById(empid);		
		return "deleted";
	}

	@Override
	public void deleteAllEmployees() {
		dao.deleteAll();
	}*/
/*
	@Override
	public int calcMonthlySal()		
	{
		int count=0;
		System.out.println("inside calcMonthlySal()");

		Long annSal = 0l;
		Long montlySal = 0L;
		Long tdsAmount=0L;
		
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date transDate = new Date();
		int month=transDate.getMonth();
		int year=transDate.getYear()+1;
		
		List<Employee> empList = dao.findAll();

		for (Employee employee : empList) {
			annSal = employee.getAnnPack();
			montlySal = annSal / 12;
			tdsAmount=(montlySal*10)/100;				
			//System.out.println(employee.getFirstName()+" " +e.getPan()+" " +month +" " + year +" " +tdsAmount +" " +e.getEmailId());
			EmpTds emp=new EmpTds(employee.getFirstName(),employee.getPan(),month,year,tdsAmount,employee.getEmailId());
			System.out.println(emp);
			count++;
			daoTds.save(emp);
		
			}
		return count;
	}	
	*/
	}
	
