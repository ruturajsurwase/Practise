package com.spring.task.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Data 
{  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	private String date;
	private float nav; 
	
}
