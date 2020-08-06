package com.techelevator;

import java.math.BigDecimal;

public class MoneyHandler {
	private BigDecimal currentBalance;

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}
}
