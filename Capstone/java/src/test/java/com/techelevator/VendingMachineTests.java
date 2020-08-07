package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTests extends Connector {

	VendingMachineCLI VMCLI = new VendingMachineCLI(menu);
	
	@Test
	public void inputItemsTest() {
		String actualResult = VMCLI.inputItems();
		String expectedResult = "Potato Crisps";
		fail("Not yet implemented");
	}

}
