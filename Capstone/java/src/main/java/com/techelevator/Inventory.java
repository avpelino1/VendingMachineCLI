package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inventory {
public Map<String, List<Product>> vendingInventory = new TreeMap<>();

	public List<Items> masterList = new ArrayList<Items>();

	File inputFile = new File("vendingmachine.csv");
	{
		try (Scanner inventoryScanner = new Scanner(inputFile)) {
			while (inventoryScanner.hasNextLine()) {
				String inventory = inventoryScanner.nextLine();
				String[] inventoryString = inventory.split("\\|");
				
				if (inventoryString[0].contains("A")) {
					for (int i =0; i <= 4; i++) {
						Chip newChip = new Chip(inventoryString[1], inventoryString[2], inventoryString[3]);
						masterList.add(newChip);
						
					}
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}