package com.spring.task.servicei;

import java.io.IOException;

import com.spring.task.model.MainClass;
import com.spring.task.model.Scheme;




public interface SchemaInterface
{

	public void saveScheme() throws IOException;

	public Iterable<Scheme> searchSchemeByName(String schemeName);

	public void savedata() throws  IOException;
	
	public Iterable<MainClass> searchSchemeByMid(int mid);
	

}
