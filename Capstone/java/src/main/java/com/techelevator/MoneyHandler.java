package com.techelevator;

import java.math.BigDecimal;

public class MoneyHandler extends Connector {
	private static double currentBalance;

	public static double getCurrentBalance() {
		return currentBalance;
	}

	public static void setCurrentBalance(double newCurrentBalance) {
		currentBalance = newCurrentBalance;
	}
	
	public static void moneyInput(double input) {
		currentBalance += input;
	
	}
}
