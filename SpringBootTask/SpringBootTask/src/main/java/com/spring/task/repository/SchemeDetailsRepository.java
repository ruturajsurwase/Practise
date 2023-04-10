package com.spring.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.task.model.MainClass;



@Repository
public interface SchemeDetailsRepository extends  JpaRepository<MainClass,Integer> 
{
	public Iterable<MainClass> findAllByMid(int msid);
} 
 