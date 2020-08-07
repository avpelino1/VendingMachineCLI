package com.techelevator;

import java.math.BigDecimal;

public class Drink implements Items1 {
	public String name;
	public String code;
	public BigDecimal price;
	public int stockRemaining = 5;
	
	public Drink(String name, String code, BigDecimal price) {
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
	public BigDecimal getPriceOfItem() {
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
	
	public void setStockRemaining(int stockRemaining) {
		this.stockRemaining = stockRemaining;
	}
	
	
}
