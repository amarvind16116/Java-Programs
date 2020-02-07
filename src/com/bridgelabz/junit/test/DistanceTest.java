package com.bridgelabz.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgelabz.logical.Distance;

public class DistanceTest {

	@BeforeClass
	public static void setUpBeforeClass() {
	}

	@Test
	public void testwhen_all_values_are_negative() {
		boolean result = Distance.findDistance(-5, -8, -2, -9);
		assertEquals(true, result);
	}

	@Test
	public void test_when_two_values_positive_and_two_negative() {
		boolean result = Distance.findDistance(5, -2, 6, -1);
		assertEquals(true, result);
	}

}
