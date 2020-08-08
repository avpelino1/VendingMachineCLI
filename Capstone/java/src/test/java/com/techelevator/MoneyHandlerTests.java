package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class MoneyHandlerTests {

	BigDecimal start = new BigDecimal(5.35);
	MoneyHandler moneyHandler = new MoneyHandler(start);
	
	@Test
	public void getCurrentBalanceTest() {
		BigDecimal actual = moneyHandler.getCurrentBalance();
		BigDecimal expected = start;
		Assert.assertEquals(expected, actual);
	}

	BigDecimal test1 = new BigDecimal(3);
	@Test
	public void moneyInputTest() {
		moneyHandler.moneyInput(test1);
//		BigDecimal actual = moneyHandler.currentBalance;
		BigDecimal expected = start;
//		Assert.assertEquals(expected, actual);
	}
	
}
