package com.spring.task.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Meta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long scheme_code;
	private String fund_house;
	private String scheme_type;
	private String scheme_category;
	private String scheme_name;
	
}
