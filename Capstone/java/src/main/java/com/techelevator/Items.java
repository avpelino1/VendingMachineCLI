package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Items extends Connector {

	private String codeOfItem;
	private BigDecimal priceOfItem;
	private int stockRemaining = 5;

	public String getCodeOfItem() {
		return codeOfItem;

	}

	public void setCodeOfItem(String codeOfItem) {
		this.codeOfItem = codeOfItem;
	}

	public BigDecimal getPriceOfItem() {
		return priceOfItem;
	}

	public void setPriceOfItem(BigDecimal priceOfItem) {
		this.priceOfItem = priceOfItem;
	}

	public int getStockRemaining() {

		if (stockRemaining < 1) {
			System.out.println("SOLD OUT");
		}
		return stockRemaining;
	}

	public void setStockRemaining(int stockRemaining) {
		this.stockRemaining = stockRemaining;
	}

	public static void listItems() {

		File inputFile = new File("vendingmachine.csv");
		{

			try (Scanner inputScanner = new Scanner(inputFile)) {

				while (inputScanner.hasNextLine()) {
					String food = inputScanner.nextLine();
				System.out.println(food);
				}
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
