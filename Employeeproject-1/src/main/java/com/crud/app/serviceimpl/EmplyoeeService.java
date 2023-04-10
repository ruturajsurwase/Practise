package com.crud.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.app.model.Employee;
import com.crud.app.repository.EmployeeRepository;
import com.crud.app.servicei.Serviceinterface;

import antlr.collections.List;

@Service
public class EmplyoeeService implements Serviceinterface {

	
	@Autowired
	EmployeeRepository er;
	
	@Override
	public void save(Employee e)
	{
		er.save(e);
		
	
		
	}

	@Override
	public Employee search(String ename)
	{
		Employee e = er.findByEname(ename);
		
		 return e;
	}

	@Override
	public void delete(int id)
	{
		er.deleteById(id);
		
	}

	@Override
	public Iterable getall()
	{
	Iterable<Employee> findAll = er.findAll();
	return findAll;
		
	}

	

	

	
	
	
	
	
	
}
