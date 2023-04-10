package com.crud.app.servicei;

import org.springframework.stereotype.Service;

import com.crud.app.model.Employee;

import antlr.collections.List;


public interface Serviceinterface 
{

	public void save(Employee e);

	public Employee search(String ename);

	public void delete(int id);

	public Iterable getall();

}
