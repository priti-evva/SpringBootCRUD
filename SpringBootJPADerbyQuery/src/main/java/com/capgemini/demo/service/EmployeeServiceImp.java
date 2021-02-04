package com.capgemini.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.demo.beans.Employee;
import com.capgemini.demo.dao.EmployeeDao;


@Service
public class EmployeeServiceImp implements EmployeeService{
	
	@Autowired
    EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployee()
	  {
		  return employeeDao.findAll();
	  }
	  
	  public Optional<Employee> getEmployeeById(String empId)
	  {
		  return employeeDao.findById(empId);
		  
	  }
	  
	  public List<Employee> getEmployeeByName(String name)
	  {
		  
		 return employeeDao.getEmployeeDetailsByName(name);
	  }
	  
	  public List<Employee> getEmployeeByDesignation(String designation)
	  {
		  
		 return employeeDao.getEmployeeDetailsByDesignation(designation);
	  }
	  
	  
	  public List<Employee> getEmployeesBySalRange(double lower,double higher)
	  {
		
		   return employeeDao.getEmployeeDetailsBySalRange(lower, higher);
	  }
	  
	  public Employee addEmployee(Employee employee)
	  {
		  employeeDao.save(employee);
		  return employee;
	  }
	  
	  public void updateEmployee(String empId,Employee employee)
	  {
		  employeeDao.save(employee);
		  
	  }
	  
	  
	  public void deleteEmployee(String empId)
	  {
		  employeeDao.deleteById(empId);
	  }
	
	
	  
	 
		
		

		
		
		  
}
