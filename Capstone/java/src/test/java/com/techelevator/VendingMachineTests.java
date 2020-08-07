package com.techelevator;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.techelevator.view.Menu;

public class VendingMachineTests extends Connector {

	private Menu menu;
	VendingMachineCLI VMCLI = new VendingMachineCLI(menu);

	@Test
	public void inputItemsTest() {

		String actualResult = VMCLI.inputItems();
		String expectedResult = "Potato Crisps";
		Assert.assertEquals("Potato Crisps", actualResult);
	}

}
