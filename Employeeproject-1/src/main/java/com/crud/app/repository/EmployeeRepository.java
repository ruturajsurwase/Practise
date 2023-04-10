package com.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.app.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> 
{
	public Employee findByEname(String ename);
}
