package com.crud.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.app.model.Employee;
import com.crud.app.servicei.Serviceinterface;



@RestController
public class EmployeeController 
{
	
	@Autowired
	Serviceinterface sri;	
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee e)
	{
	   sri.save(e);
	   
	   return "Employee saved";
	}
	
	
	@GetMapping("/name/{ename}")
	public Employee searchByName(@PathVariable String ename)
	{
	  
	return sri.search(ename);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteemp(@PathVariable int id)
	{
		  sri.delete(id);
		return "deleted";
	}
	
    @GetMapping("/getall")
	public Iterable getall()
	{
	  return sri.getall();
	}
	
    
    
	
}
