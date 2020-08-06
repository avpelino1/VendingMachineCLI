package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };

	private static final String[] PURCHASE_MENU = {"Feed Money", "Select Product", "Back"};
	private static final String[] MONEY_MENU = {"$1 Bill", "$2 Bill", "$5 Bill", "Back"};
	
	
	
	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			System.out.println(choice);
			
			
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
				File inputFile = new File("vendingmachine.csv");
				
				try (Scanner inputScanner = new Scanner(inputFile)) {
					
					while (inputScanner.hasNextLine()) {
						String food = inputScanner.nextLine();
						String [] foodSplit = food.split("|");
						 
						
							System.out.println(foodSplit.length);
						}
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
				
				
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				
				
				
				processPurchaseMenuOptions();
				
			}
		}
	}

	private void processPurchaseMenuOptions() {
		String purchaseMenuOption = "";
		
		while (!purchaseMenuOption.equals("Back")) {
		purchaseMenuOption =(String) menu.getChoiceFromOptions(PURCHASE_MENU);

		if (purchaseMenuOption.equals("Feed Money")) {
			processMoneyFeed();
		}
		
		}
	}

	private void processMoneyFeed() {
		String feedOptions = "";
		while (!feedOptions.equals("Back")) {
		feedOptions = (String) menu.getChoiceFromOptions(MONEY_MENU);
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
