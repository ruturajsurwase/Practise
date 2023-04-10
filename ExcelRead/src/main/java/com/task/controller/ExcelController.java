package com.task.controller;

import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.task.model.ExcelData;

@Controller
public class ExcelController 
{

	
	  @RequestMapping(value = "/upload")
	   public String showUploadForm() 
		{
	      return "login";
	   }
	  
//	  @RequestMapping(value = "/uploadsheet")
//	   public String uploadExcelFile(@RequestParam("file") MultipartFile file) throws IOException 
//	  {
//	      // Get the input stream of the uploaded file
//	      InputStream inputStream = file.getInputStream();
//
//	      // Create a workbook object from the input stream
//	      Workbook workbook = new XSSFWorkbook(inputStream);
//
//	      // Get the first sheet of the workbook
//	      Sheet sheet = workbook.getSheetAt(0);
//
//	      // Iterate through each row of the sheet
//	      for (Row row : sheet) {
//	         // Skip the header row
//	         if (row.getRowNum() == 0) {
//	            continue;
//	         }
//
//	         // Create a new ExcelData object
//	         ExcelData data = new ExcelData();
//
//	         // Set the data from the row to the object
//	         data.setName(row.getCell(0).getStringCellValue());
//	         data.setEmail(row.getCell(1).getStringCellValue());
//	         data.setPhone(row.getCell(2).getStringCellValue());
//
//	         // Save the data to the database
//	         repository.save(data);
//	      }
//
//	      // Close the workbook and input stream
//	      workbook.close();
//	      inputStream.close();
//
//	      // Redirect to a success page
//	      return "success";
//	   }
	
}
