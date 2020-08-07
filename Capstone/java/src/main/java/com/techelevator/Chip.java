package com.techelevator;

import java.math.BigDecimal;

public class Chip extends Connector implements Items1{
	
	public String name;
	public String code;
	public String price;
	public int stockRemaining = 5;
	
	public Chip(String name, String code, String price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}
	
	public void realInput(String name, String code, String price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}
	
	@Override
	public String getNameOfItem() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getCodeOfItem() {
		// TODO Auto-generated method stub
		return this.code;
	}

	@Override
	public String getPriceOfItem() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public int getStockRemaining() {
		if (stockRemaining < 1) {
			System.out.println("SOLD OUT");
		}
		return this.stockRemaining;
	}
	
	public void setStockRemaining() {
		this.stockRemaining -= 1;
	}
	
}