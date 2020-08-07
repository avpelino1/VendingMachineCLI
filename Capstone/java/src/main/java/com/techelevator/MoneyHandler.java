package com.techelevator;

import java.math.BigDecimal;

public class MoneyHandler extends Connector {
	private static BigDecimal currentBalance;

	public static BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public static void setCurrentBalance(BigDecimal newCurrentBalance) {
		currentBalance = newCurrentBalance;
	}

	public static void moneyInput(BigDecimal input) {
		currentBalance = currentBalance.add(input);

	}

	public static void moneyInput(double d) {
		BigDecimal bigDec = new BigDecimal(d);
		currentBalance = currentBalance.add(bigDec);

	}
}
