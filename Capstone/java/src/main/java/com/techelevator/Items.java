package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Items {
	
	
	File inputFile = new File("vendingmachine.csv"); {

	try (Scanner inputScanner = new Scanner(inputFile)) {

		while (inputScanner.hasNextLine()) {
			String food = inputScanner.nextLine();
			String[] foodSplit = food.split("|");

			if (foodSplit[0].equals("A")) {
				int endIndex = food.length() - 10;
				String item = food.substring(3, endIndex);
				System.out.println(item);
			} else if (foodSplit[0].equals("B") || foodSplit[0].equals("C")) {
				int endIndex = food.length() - 11;
				String item = food.substring(3, endIndex);
				System.out.println(item);
			} else if (foodSplit[0].equals("D")) {
				int endIndex = food.length() - 9;
				String item = food.substring(3, endIndex);
				System.out.println(item);
			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
