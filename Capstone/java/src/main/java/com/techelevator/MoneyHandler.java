package com.techelevator;

import java.math.BigDecimal;

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
}
