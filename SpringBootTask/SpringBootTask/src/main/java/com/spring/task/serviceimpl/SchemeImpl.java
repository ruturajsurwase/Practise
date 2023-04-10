package com.spring.task.serviceimpl;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.task.model.MainClass;
import com.spring.task.model.Scheme;
import com.spring.task.repository.SchemeDetailsRepository;
import com.spring.task.repository.SchemeRepository;
import com.spring.task.servicei.SchemaInterface;

@Service
public class SchemeImpl implements SchemaInterface {
	@Autowired
	SchemeRepository schemerepository;

	@Autowired
	SchemeDetailsRepository schemedetailsrepository;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void saveScheme() throws IOException 
	{
		ObjectMapper objectMapper = new ObjectMapper();
		String apiUrl = "https://api.mfapi.in/mf";
		URL url = new URL(apiUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		InputStream inputStream = (InputStream) connection.getInputStream();
		List<Scheme> schemelist = objectMapper.readValue(inputStream, new TypeReference<List<Scheme>>() {
		});
		schemerepository.saveAll(schemelist);

	}

	@Override
	public Iterable<Scheme> searchSchemeByName(String schemeName) 
	{

		Iterable<Scheme> slist = schemerepository.findAllBySchemeName(schemeName);
		return slist;

	}

	@Override
	public void savedata() throws IOException 
	{

		String apiUrl2 = "https://api.mfapi.in/mf/100077";
		MainClass meta = restTemplate.getForObject(apiUrl2, MainClass.class);
		System.out.println(meta);
		schemedetailsrepository.save(meta);

	}

	@Override
	public Iterable<MainClass> searchSchemeByMid(int mid) {

		Iterable<MainClass> slist = schemedetailsrepository.findAllByMid(mid);
		return slist;

	}

}
