package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

import com.techelevator.view.Menu;

public class VendingMachineCLI extends Connector {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };

	private static final String[] PURCHASE_MENU = { "Feed Money", "Select Product", "Finish Transaction", "Back" };
	private static final String[] MONEY_MENU = { "$1 Bill", "$2 Bill", "$5 Bill", "$10 Bill", "Back" };

	private BigDecimal currentMoneyProvided;
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
				Items.listItems();

			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {

				processPurchaseMenuOptions();

			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				exit();
			}
		}
	}

	private void exit() {
		System.exit(0);
	}
	
//	private void listItems() {
//		File inputFile = new File("vendingmachine.csv");
//
//		try (Scanner inputScanner = new Scanner(inputFile)) {
//
//			while (inputScanner.hasNextLine()) {
//				String food = inputScanner.nextLine();
//				String[] foodSplit = food.split("|");
//
//				if (foodSplit[0].equals("A")) {
//					int endIndex = food.length() - 10;
//					String item = food.substring(3, endIndex);
//					System.out.println(item);
//				} else if (foodSplit[0].equals("B") || foodSplit[0].equals("C")) {
//					int endIndex = food.length() - 11;
//					String item = food.substring(3, endIndex);
//					System.out.println(item);
//				} else if (foodSplit[0].equals("D")) {
//					int endIndex = food.length() - 9;
//					String item = food.substring(3, endIndex);
//					System.out.println(item);
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	private void processPurchaseMenuOptions() {
		String purchaseMenuOption = "";

		while (!purchaseMenuOption.equals("Back")) {
			purchaseMenuOption = (String) menu.getChoiceFromOptions(PURCHASE_MENU);

			if (purchaseMenuOption.equals("Feed Money")) {
				processMoneyFeed();
			}

		}
	}

	private void processMoneyFeed() {
		String feedOptions = "";
		while (!feedOptions.equals("Back")) {
			feedOptions = (String) menu.getChoiceFromOptions(MONEY_MENU);
			if (feedOptions.equals("1")) {
				BigDecimal addOne = new BigDecimal(1.00);
				currentMoneyProvided = currentMoneyProvided.add(addOne);
			}
			System.out.println("Current money provided: " + currentMoneyProvided);
			
			
		}
		
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
