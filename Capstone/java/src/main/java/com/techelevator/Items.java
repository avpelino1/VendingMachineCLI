package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Items extends Connector {
Map<String, String> itemChoice = new HashMap<String, String>() ; {

	itemChoice.put("A1", "Potato Crisps");
	itemChoice.put("A2", "Stackers");
	itemChoice.put("A3", "Grain Waves");
	itemChoice.put("A4", "Cloud Popcorn");
	itemChoice.put("B1", "Moonpie");
	itemChoice.put("B2", "Cowtales");
	itemChoice.put("B3", "Wonka Bar");
	itemChoice.put("B4", "Crunchie");
	itemChoice.put("C1", "Cola");
	itemChoice.put("C2", "Dr. Salt");
	itemChoice.put("C3", "Mountain Melter");
	itemChoice.put("C4", "Heavy");
	itemChoice.put("D1", "U-Chews");
	itemChoice.put("D2", "Little League Chew");
	itemChoice.put("D3", "Chiclets");
	itemChoice.put("D4", "Trimplemint");
}

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
