package com.bridgelabz.junit.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgelabz.utils.Utility;

public class PowerOf2Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testFirstIndex() {
		int[] expected = {2, 4, 8, 16, 32};
		int[] actual = Utility.powerOf(5);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void testZeroIndex() {
		int[] expected = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] actual = Utility.powerOf(32);
		assertArrayEquals(expected, actual);
	}
	

}
