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

	public List<Integer> changeGiven( ) {
		BigDecimal oneHundred = new BigDecimal(100);
		BigDecimal test = currentBalance.multiply(oneHundred);
		int changeMoney = test.intValue();

		int quarters = 0;
		int dimes = 0;
		int nickels = 0;

		if (changeMoney >= 25) {
			quarters += 1;
			changeMoney -= 25;
		}
		else if (changeMoney >= 10) {
			dimes += 1;
			changeMoney -= 10;
		}
		else if (changeMoney >= 5) {
			nickels += 1;
			changeMoney -= 5;
		}

		changeReturn.add(quarters);
		changeReturn.add(dimes);
		changeReturn.add(nickels);

		return changeReturn;
	}
	
	public static void changeForUser(List<Integer> coins) {
		int quarterReturns = coins.get(0);
		int dimesReturns = coins.get(1);
		int nickelReturns = coins.get(2);
		
		System.out.println("Your change in quarters: " + quarterReturns);
		System.out.println("Your change in dimes: " + dimesReturns);
		System.out.println("Your change in nickels: " + nickelReturns);

		
		
		
	}

	public static List<Integer> changeGiven(MoneyHandler moneyHandler) {
		// TODO Auto-generated method stub
		return null;
	}
}