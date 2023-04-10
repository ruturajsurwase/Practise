package com.task.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class ExcelData 
{ 
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String Stock_Name;
	private String Stock;
	private String pISIN;
	private double Allocated_Quantity;
	private double Blocked_for_Trade;
	private double Block_For_Margin;
	private double Current_Market_Price;
	private  double Change;
	private  double Market_Value;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStock_Name() {
		return Stock_Name;
	}
	public void setStock_Name(String stock_Name) {
		Stock_Name = stock_Name;
	}
	public String getStock() {
		return Stock;
	}
	public void setStock(String stock) {
		Stock = stock;
	}
	public String getpISIN() {
		return pISIN;
	}
	public void setpISIN(String pISIN) {
		this.pISIN = pISIN;
	}
	public double getAllocated_Quantity() {
		return Allocated_Quantity;
	}
	public void setAllocated_Quantity(double allocated_Quantity) {
		Allocated_Quantity = allocated_Quantity;
	}
	public double getBlocked_for_Trade() {
		return Blocked_for_Trade;
	}
	public void setBlocked_for_Trade(double blocked_for_Trade) {
		Blocked_for_Trade = blocked_for_Trade;
	}
	public double getBlock_For_Margin() {
		return Block_For_Margin;
	}
	public void setBlock_For_Margin(double block_For_Margin) {
		Block_For_Margin = block_For_Margin;
	}
	public double getCurrent_Market_Price() {
		return Current_Market_Price;
	}
	public void setCurrent_Market_Price(double current_Market_Price) {
		Current_Market_Price = current_Market_Price;
	}
	public double getChange() {
		return Change;
	}
	public void setChange(double change) {
		Change = change;
	}
	public double getMarket_Value() {
		return Market_Value;
	}
	public void setMarket_Value(double market_Value) {
		Market_Value = market_Value;
	}
	
	public ExcelData() 
	{
		super();
	}
	
	
	
	public ExcelData(int id, String stock_Name, String stock, String pISIN, double allocated_Quantity,
			double blocked_for_Trade, double block_For_Margin, double current_Market_Price, double change,
			double market_Value) {
		super();
		this.id = id;
		Stock_Name = stock_Name;
		Stock = stock;
		this.pISIN = pISIN;
		Allocated_Quantity = allocated_Quantity;
		Blocked_for_Trade = blocked_for_Trade;
		Block_For_Margin = block_For_Margin;
		Current_Market_Price = current_Market_Price;
		Change = change;
		Market_Value = market_Value;
	}
	
	
	


}
