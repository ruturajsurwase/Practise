package com.crud.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int eid;
	private String ename;
	private String departmentName;
	private String doj;
	private int mid;
}
