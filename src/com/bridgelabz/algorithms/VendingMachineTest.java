package com.bridgelabz.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void givenZero_whenCount_thenShouldBeZero()
	{
		
		assertEquals(1,VendingMachine.count(100));
	}
	@Test
	public void givenOne_whenCount_thenShouldBeOne()
	{
		
		assertEquals(2,VendingMachine.count(1050));
	}

}
