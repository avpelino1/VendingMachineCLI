package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Items extends Connector {
	
//	static Map<String, String> itemChoice = new HashMap<String, String>();
//	static Map<String, Double> itemPrice = new HashMap<String, Double>();
//	private String codeOfItem;
//	private BigDecimal priceOfItem;
//	private int stockRemaining = 5;
//
//	public static void buildItemChoice() {
//
//		// TODO: Instead of hard-coding, the logic to read in data from the data might
//		// go here?
//
//		itemChoice.put("A1", "Potato Crisps");
//		itemChoice.put("A2", "Stackers");
//		itemChoice.put("A3", "Grain Waves");
//		itemChoice.put("A4", "Cloud Popcorn");
//		itemChoice.put("B1", "Moonpie");
//		itemChoice.put("B2", "Cowtales");
//		itemChoice.put("B3", "Wonka Bar");
//		itemChoice.put("B4", "Crunchie");
//		itemChoice.put("C1", "Cola");
//		itemChoice.put("C2", "Dr. Salt");
//		itemChoice.put("C3", "Mountain Melter");
//		itemChoice.put("C4", "Heavy");
//		itemChoice.put("D1", "U-Chews");
//		itemChoice.put("D2", "Little League Chew");
//		itemChoice.put("D3", "Chiclets");
//		itemChoice.put("D4", "Triplemint");
//	}
//
//	public static void buildPrice() {
//		itemPrice.put("A1", 3.05);
//		itemPrice.put("A2", 1.45);
//		itemPrice.put("A3", 2.75);
//		itemPrice.put("A4", 3.65);
//		itemPrice.put("B1", 1.80);
//		itemPrice.put("B2", 1.50);
//		itemPrice.put("B3", 1.50);
//		itemPrice.put("B4", 1.75);
//		itemPrice.put("C1", 1.25);
//		itemPrice.put("C2", 1.50);
//		itemPrice.put("C3", 1.50);
//		itemPrice.put("C4", 1.50);
//		itemPrice.put("D1", 0.85);
//		itemPrice.put("D2", 0.95);
//		itemPrice.put("D3", 0.75);
//		itemPrice.put("D4", 0.75);
//	}
//
//
//	public static String getItem(String itemCode) {
//		System.out.println("a");
//		String nameOfItem = itemChoice.get(itemCode);
//		Double priceOfItem = itemPrice.get(itemCode);
//		String nameAndPrice = nameOfItem + " for $" + priceOfItem;
//		return nameAndPrice;
//	}
//	
//
//	public String getCodeOfItem() {
//		return codeOfItem;
//	}
//
//	public void setCodeOfItem(String codeOfItem) {
//		this.codeOfItem = codeOfItem;
//	}
//
//	public BigDecimal getPriceOfItem() {
//		return priceOfItem;
//	}
//
//	public void setPriceOfItem(BigDecimal priceOfItem) {
//		this.priceOfItem = priceOfItem;
//	}
//
//	public int getStockRemaining() {
//
//		if (stockRemaining < 1) {
//			System.out.println("SOLD OUT");
//		}
//		return stockRemaining;
//	}
//
//	public void setStockRemaining(int stockRemaining) {
//		this.stockRemaining = stockRemaining;
//	}
//
//	public static void listItems() {
//
//		File inputFile = new File("vendingmachine.csv");
//		{
//
//			try (Scanner inputScanner = new Scanner(inputFile)) {
//
//				while (inputScanner.hasNextLine()) {
//					String food = inputScanner.nextLine();
//					System.out.println(food);
//				}
//
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
}
