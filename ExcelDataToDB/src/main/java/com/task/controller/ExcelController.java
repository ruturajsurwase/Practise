package com.task.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.task.helper.ExcelHelper;
import com.task.model.ExcelData;
import com.task.serviceinterface.ExcelInterface;


@CrossOrigin("*")
@RestController
public class ExcelController 
{

	@Autowired
	ExcelInterface excelinterface;
	
	@PostMapping("/uploadFile")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file)
    {
		      if(ExcelHelper.checkExcelformat(file))
		      {
		    	  excelinterface.save(file);
		         return ResponseEntity.status(HttpStatus.ACCEPTED).body("uploaded excel and data saved to data base");		
		    	  
		      }
		     return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excel file only");		
	}
	
	
	@GetMapping("/getdata")
	public List<ExcelData> getAllExcelData()
	{
		return excelinterface.getAllExcelData();
		
	}
	
	
	
	
	
}
