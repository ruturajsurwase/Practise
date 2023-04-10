package com.spring.task.controller;



import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.task.model.MainClass;
import com.spring.task.model.Scheme;
import com.spring.task.servicei.SchemaInterface;



@RestController
@RequestMapping("/scheme")
public class SchemeController 
{
		@Autowired
		SchemaInterface schemaInterface;
		
		
	//for received data store in database	
	@PostMapping("/saveScheme")
    public String saveScheme() throws IOException
	{
		schemaInterface.saveScheme();
        return "Data saved Successfully...";
    }
	
	//for received data fetch by scheme name
	@GetMapping("/searchbyname/{schemeName}")
	public Iterable<Scheme> searchSchemeByName(@PathVariable String schemeName)
	{
		Iterable<Scheme> searchSchemeByName = schemaInterface.searchSchemeByName(schemeName);
		
		return searchSchemeByName;
	}
	
	
	@PostMapping("/saveData")
	public String savedata() throws IOException
	{
		schemaInterface.savedata();
		return "saved.....";
		   
	}
	@GetMapping("/searchbymid/{mid}")           
	public Iterable<MainClass> searchSchemeById(@PathVariable int mid)
	{
		Iterable<MainClass> searchSchemeById = schemaInterface.searchSchemeByMid(mid);
		
		return searchSchemeById;
	}
	
	
		
	
}
