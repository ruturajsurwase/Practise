package com.spring.task.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.task.model.Scheme;




@Repository
public interface SchemeRepository extends JpaRepository<Scheme,String>
{

	public Iterable<Scheme> findAllBySchemeName(String schemeName);
	

}
