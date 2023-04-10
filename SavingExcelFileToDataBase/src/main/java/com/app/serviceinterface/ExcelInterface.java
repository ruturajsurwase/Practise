package com.app.serviceinterface;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.model.ExcelData;

public interface ExcelInterface 
{

	public	void save(MultipartFile file);

	public List<ExcelData> getAllExcelData();

}
