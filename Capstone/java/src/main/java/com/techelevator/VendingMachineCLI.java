package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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

	Chip chip = new Chip();
	private BigDecimal currentBalance = BigDecimal.valueOf(0);
	MoneyHandler moneyHandler = new MoneyHandler(currentBalance);

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;

	}

	public void run() {

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

	public void processPurchaseMenuOptions() {
		String purchaseMenuOption = "";
		String theName = "";
		while (!purchaseMenuOption.equals("Back")) {
			purchaseMenuOption = (String) menu.getChoiceFromOptions(PURCHASE_MENU);

			if (purchaseMenuOption.equals("Feed Money")) {
				processMoneyFeed(MONEY_MENU);
			}
			if (purchaseMenuOption.equals("Select Product")) {
				listItems();
				System.out.println("Please enter a code of the item you want to purchase: ");
				Scanner codeOfItem = new Scanner(System.in);
				String itemCode = codeOfItem.nextLine();
				chip.importChipInfo(itemCode);
				File inputFile = new File("vendingmachine.csv");
				int counter = 0;
				try (Scanner inputScanner = new Scanner(inputFile)) {
					while (inputScanner.hasNextLine()) {
						String food = inputScanner.nextLine();
						if (!food.contains(itemCode)) {
							counter += 1;
						} else if (counter == 16) {
							System.out.println("Invalid product code.");
//							menu.displayMenuOptions(PURCHASE_MENU);
						} else {
							System.out.println("You have chosen to purchase " + chip.getNameOfItem() + " for "
									+ chip.getPriceOfItem());
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				String costOfItem = chip.getPriceOfItem();
				BigDecimal cost = new BigDecimal(costOfItem);
				BigDecimal costNegative = new BigDecimal(-1);
				BigDecimal costFinal = cost.multiply(costNegative);
				moneyHandler.moneyInput(costFinal);

				System.out.println("You have " + moneyHandler.getCurrentBalance() + " remaining");

			}

		}

	}

	public void processMoneyFeed(String[] moneyMenu) {

		BigDecimal moneyFeed1 = new BigDecimal(1);
		BigDecimal moneyFeed2 = new BigDecimal(2);
		BigDecimal moneyFeed3 = new BigDecimal(5);
		BigDecimal moneyFeed4 = new BigDecimal(10);

		String feedOptions = "";

		feedOptions = (String) menu.getChoiceFromOptions(moneyMenu);

		if (feedOptions.equals("$1 Bill")) {
			moneyHandler.moneyInput(moneyFeed1);
			System.out.println("You have added $1");
			feedOptions = "1.00";
		} else if (feedOptions.equals("$2 Bill")) {
			moneyHandler.moneyInput(moneyFeed2);
			System.out.println("You have added $2");
			feedOptions = "2.00";
		} else if (feedOptions.equals("$5 Bill")) {
			moneyHandler.moneyInput(moneyFeed3);
			System.out.println("You have added $5");
			feedOptions = "5.00";
		} else if (feedOptions.equals("$10 Bill")) {
			moneyHandler.moneyInput(moneyFeed4);
			System.out.println("You have added $10");
			feedOptions = "10.00";
		}
		System.out.println("You have deposited: $" + moneyHandler.getCurrentBalance());
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
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
