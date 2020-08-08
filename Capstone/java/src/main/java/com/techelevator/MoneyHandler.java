package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MoneyHandler extends Connector {
	private BigDecimal currentBalance;

	public MoneyHandler(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public BigDecimal getCurrentBalance() {
		return this.currentBalance;
	}

	public void moneyInput(BigDecimal input) {
		this.currentBalance = currentBalance.add(input);
	}

	public static List<Integer> changeReturn = new ArrayList<Integer>();

	public static List<Integer> changeGiven(BigDecimal moneyHandler) {
		BigDecimal changeMoney = moneyHandler.multiply(100);
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;

		while (changeMoney >= 25) {
			quarters += 1;
			changeMoney -= 25;
		}
		while (changeMoney >= 10) {
			dimes += 1;
			changeMoney -= 10;
		}
		while (changeMoney >= 5) {
			nickels += 1;
			changeMoney -= 5;
		}

		changeReturn.add(quarters);
		changeReturn.add(dimes);
		changeReturn.add(nickels);

		return changeReturn;
	}
	
	public static void changeForUser(List<String> coins) {
		
		System.out.println("Your change in quarters: " + changeReturn.get(0));
		System.out.println("Your change in dimes: " + changeReturn.get(1));
		System.out.println("Your change in nickels: " + changeReturn.get(2));

		
		
		
	}

	public static List<Integer> changeGiven(MoneyHandler moneyHandler) {
		// TODO Auto-generated method stub
		return null;
	}
}