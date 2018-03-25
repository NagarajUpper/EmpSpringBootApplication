package com.springboot.quickstart.springboot.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.quickstart.springboot.model.Employee;

@Service
public class EmpServiceImpl {

	@Autowired
	private DerbyRepository derbyRepository;

	public List<Employee> getEmps() {
		List<Employee> list = new ArrayList<>();

		Iterable<Employee> findAll = derbyRepository.findAll();
		for (Employee employee : findAll) {

			list.add(employee);
		}
		return list;
	}
	
	public void saveEmp( Employee employee) {
		
		derbyRepository.save(employee);
		
	}

	public Employee getOneEmp(String id) {
		
		Employee findOne = derbyRepository.findOne(id);
		
		return findOne;
	}

	public void deleteEmp(String id) {
		
		derbyRepository.delete(id);
		
	}

}
