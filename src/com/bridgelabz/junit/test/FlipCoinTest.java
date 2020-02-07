package com.bridgelabz.junit.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgelabz.logical.FlipCoin;

public class FlipCoinTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test_when_value_is_negative() {
		boolean result = FlipCoin.flipCoins(-3);
		String message = "Coin tossed 0 times";
		assertTrue(message, result);
	}
	@Test
	public void test_when_value_is_positive(){
		boolean result = FlipCoin.flipCoins(3);
		String message = "Coin tossed 3 times";
		assertTrue(message, result);
	}

}
