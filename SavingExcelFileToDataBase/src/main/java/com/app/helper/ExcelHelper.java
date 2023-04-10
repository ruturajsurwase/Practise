package com.app.helper;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.ExcelData;



public class ExcelHelper 
{

	public static boolean checkExcelformat(MultipartFile file)
	{
		String contentType = file.getContentType();
		if(contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
		{
			return true;
		}
		else
		{
			return false;	
		}
		
	}
	
	//converts excel file to list;
	public static List<ExcelData> convertExcelToListofProduct(InputStream is)
	{
	
		List<ExcelData> list =new ArrayList<>();
		
		try
		{
			XSSFWorkbook Workbook = new XSSFWorkbook(is);
		
			XSSFSheet sheet=Workbook.getSheet("Demat");
			
			     int rownumber=0;
			    
			       Iterator<Row> iterator = sheet.iterator();
				   while(iterator.hasNext())
				   {
					   Row row = iterator.next();	
					   if(rownumber==0)
					   {
						   rownumber++;
						   continue;
					   }
					   
					   Iterator<Cell> cells = row.iterator();
					   int cid=0;
					   ExcelData e=new  ExcelData ();
					   
					   while(cells.hasNext())
					   {
						   Cell cell = cells.next();
						   
						   switch(cid)
						   {
						  
						   case 0:
							  e.setStockName(cell.getStringCellValue());
							  break;
						   case 1:
							   e.setStock(cell.getStringCellValue());
							   break;
						   case 2:
							   e.setIisin(cell.getStringCellValue());
							   break;
						   case 3:
							  e.setAllocatedQuantity((double)cell.getNumericCellValue()); 
							  break; 
						   case 4:
							   e.setBlockedforTrade((double)cell.getNumericCellValue());
							   break;
							case 5:
								e.setBlockForMargin((double)cell.getNumericCellValue());
								break;
							case 6:
								e.setCurrentMarketPrice((double)cell.getNumericCellValue());
								break;
							case 7:
								e.setCchange((double)cell.getNumericCellValue());
								break;
							case 8:
								e.setMarketValue((double)cell.getNumericCellValue());
								break;
							default:
								break;
						    }
						   
						   cid++;
					   }
					  
					   list.add(e);    

				   }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	
	
		
		
		
		
		return list;
		
	}

	
	
	
	
}