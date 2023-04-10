package com.task.serviceimpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.task.helper.ExcelHelper;
import com.task.model.ExcelData;
import com.task.repository.ExcelRepository;
import com.task.serviceinterface.ExcelInterface;



@Service
public class ExcelService implements ExcelInterface
{
	
	@Autowired
	ExcelRepository excelrepository;

	 
	@Override
	public void save(MultipartFile file) 
	{
		 try 
		 {
			List<ExcelData> exceldatalist= ExcelHelper.convertExcelToListofProduct(file.getInputStream());
			
			excelrepository.saveAll(exceldatalist);
			
		} 
		 catch (IOException e) 
		 {
		
			e.printStackTrace();
		}
		
	}


	@Override
	public List<ExcelData> getAllExcelData() 
	{
		
		  return excelrepository.findAll();
	}
	
	
	
}
