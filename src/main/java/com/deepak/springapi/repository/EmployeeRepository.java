package com.deepak.springapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

import com.deepak.springapi.entity.Employee;

public interface EmployeeRepository extends Repository<Employee, String> {

	public List<Employee> findAll();

	public Optional<Employee> findOne(String id);

	public Optional<Employee> findByEmail(String email);

	public Employee save(Employee employee); //update and insert

	public void delete(Employee employee);
	
	
}