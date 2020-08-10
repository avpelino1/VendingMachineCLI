package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inventory {
	
	
	public int stockSold = 5;

	public int getStockSold() {
		return stockSold++;
	}

	public void setStockSold(int stockSold) {
		this.stockSold = stockSold;
	}
	
	
	

//	public Map<String, List<Product>> vendingInventory = new TreeMap<>();
//
//	public List<Items> masterList = new ArrayList<Items>();
//
//	File inputFile = new File("vendingmachine.csv");
//	{
//		try (Scanner inventoryScanner = new Scanner(inputFile)) {
//			while (inventoryScanner.hasNextLine()) {
//				String inventory = inventoryScanner.nextLine();
//				String[] inventoryString = inventory.split("\\|");
//
//				if (inventoryString[0].contains("A")) {
//					for (int i = 0; i <= 4; i++) {
//						Chip newChip = new Chip(inventoryString[1], inventoryString[2], inventoryString[3]);
//						masterList.add(newChip);
//
//					}
//				}
//
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

//	public Map<String, List<Items1>> vendingInventory = new TreeMap<>();
//
//	public List<Items> masterList = new ArrayList<Items>();
//
//	File inputFile = new File("vendingmachine.csv");
//	{
//		try (Scanner inventoryScanner = new Scanner(inputFile)) {
//			while (inventoryScanner.hasNextLine()) {
//				String inventory = inventoryScanner.nextLine();
//				String[] inventoryString = inventory.split("\\|");
//
//				if (inventoryString[0].contains("A")) {
//					for (int i = 0; i <= 4; i++) {
//						Chip newChip = new Chip(inventoryString[1], inventoryString[2], inventoryString[3]);
//						((List<Items1>) vendingInventory).add(newChip);
//
//					}
//				}
//				if (inventoryString[0].contains("D")) {
//					for (int i = 0; i <= 4; i++) {
//						Gum newGum = new Gum(inventoryString[1], inventoryString[2], inventoryString[3]);
//						((List<Items1>) vendingInventory).add(newGum);
//
//					}
//				}
//				if (inventoryString[0].contains("B")) {
//					for (int i = 0; i <= 4; i++) {
//						Candy newCandy = new Candy(inventoryString[1], inventoryString[2], inventoryString[3]);
//						((List<Items1>) vendingInventory).add(newCandy);
//
//					}
//				}
//				if (inventoryString[0].contains("C")) {
//					for (int i = 0; i <= 4; i++) {
//						Drink newDrink = new Drink(inventoryString[1], inventoryString[2], inventoryString[3]);
//						((List<Items1>) vendingInventory).add(newDrink);
//
//					}
//				}
//				
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
  }