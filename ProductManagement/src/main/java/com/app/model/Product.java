package com.app.model;

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
public class Product 
{
	@Id
  @GeneratedValue(strategy =GenerationType.AUTO)
  private Integer id;
  private String productName;
  private String dod;
  
  
}
