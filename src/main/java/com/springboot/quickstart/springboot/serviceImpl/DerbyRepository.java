package com.springboot.quickstart.springboot.serviceImpl;

import org.springframework.data.repository.CrudRepository;

import com.springboot.quickstart.springboot.model.Employee;

public interface DerbyRepository extends CrudRepository<Employee, String> {

}
