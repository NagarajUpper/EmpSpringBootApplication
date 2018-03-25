package com.springboot.quickstart.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.quickstart.springboot.model.Employee;
import com.springboot.quickstart.springboot.serviceImpl.EmpServiceImpl;

@RestController
public class EmpAppcontroller {

	@Autowired
	private EmpServiceImpl empServiceImpl;

	@RequestMapping(method = RequestMethod.GET, value = "/employees")
	public List<Employee> getEmployee() {
		List<Employee> emps = empServiceImpl.getEmps();

		return emps;

	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void postEmp(@RequestBody Employee employee) {
		empServiceImpl.saveEmp(employee);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/employees/{id}")
	public Employee getOneEmp(@PathVariable("id") String id) {
		
		Employee emp=empServiceImpl.getOneEmp(id);
		return emp;
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	public void deleteEmp(@PathVariable("id") String id) {
		
		empServiceImpl.deleteEmp(id);
		
		
	}
	

}
