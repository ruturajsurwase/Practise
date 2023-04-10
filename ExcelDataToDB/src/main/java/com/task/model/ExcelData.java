package com.task.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExcelData 
{
    @Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer eid;
	private String stockName;
	private String stock;
	private String iisin;
	private double allocatedQuantity;
	private double blockedforTrade;
	private double blockForMargin;
	private double currentMarketPrice;
	private  double cchange;
	private  double marketValue;
	
}
