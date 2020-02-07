package com.bridgelabz.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.algorithms.VendingMachine;

public class VendingMachineTest {

	@Test
	public void givenZero_whenCount_thenShouldBeZero() {

		assertEquals(1, VendingMachine.count(100));
	}

	@Test
	public void givenOne_whenCount_thenShouldBeOne() {

		assertEquals(2, VendingMachine.count(1050));
	}

}
