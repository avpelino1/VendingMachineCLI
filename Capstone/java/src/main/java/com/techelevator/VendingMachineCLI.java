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
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE,
			MAIN_MENU_OPTION_EXIT };

	private static final String[] PURCHASE_MENU = { "Feed Money", "Select Product", "Finish Transaction", "Back" };
	private static final String[] MONEY_MENU = { "$1 Bill", "$2 Bill", "$5 Bill", "$10 Bill", "Back" };

	public Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {

		Items.buildItemChoice();
		Items.buildPrice();

		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			System.out.println(choice);
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
				listItems();

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

	public static String inputItems() {
		File inputFile = new File("vendingmachine.csv");
		String inputStr = "";
		{
			try (Scanner inputScanner = new Scanner(inputFile)) {
				while (inputScanner.hasNextLine()) {
					String food = inputScanner.nextLine();
					String[] info = food.split("\\|");
					String name = info[1];
					String code = info[0];
					String price = new String(info[2]);
					String type = info[3];
					if (type.equals("Chip")) {
						Chip newChip = new Chip(name, code, price);
						inputStr = name;
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		return inputStr;
	}

	private void processPurchaseMenuOptions() {
		String purchaseMenuOption = "";

		while (!purchaseMenuOption.equals("Back")) {
			purchaseMenuOption = (String) menu.getChoiceFromOptions(PURCHASE_MENU);

			if (purchaseMenuOption.equals("Feed Money")) {
				processMoneyFeed();
			}
			if (purchaseMenuOption.equals("Select Product")) {
				listItems();
				System.out.println("Please enter a code of the item you want to purchase: ");
				Scanner codeOfItem = new Scanner(System.in);
				String itemCode = codeOfItem.nextLine();
				String nameAndPrice = Items.getItem(itemCode);
				System.out.println("You have chosen to purchase" + nameAndPrice);
			}
		}
	}

	private void processMoneyFeed() {
		String feedOptions = "";
		while (!feedOptions.equals("Back")) {
			feedOptions = (String) menu.getChoiceFromOptions(MONEY_MENU);
			if (feedOptions.equals("$1 Bill")) {
				MoneyHandler.moneyInput(1.00);
			} else if (feedOptions.equals("$2 Bill")) {
				MoneyHandler.moneyInput(2.00);
			} else if (feedOptions.equals("$5 Bill")) {
				MoneyHandler.moneyInput(5.00);
			} else if (feedOptions.equals("$10 Bill")) {
				MoneyHandler.moneyInput(10.00);
			}
			System.out.println("Current money provided: " + MoneyHandler.getCurrentBalance());
		}

	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
		inputItems();
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
				e.printStackTrace();
			}
		}
	}
}
