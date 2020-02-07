package com.bridgelabz.junit.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgelabz.utils.Utility;

public class QuadraticTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void check_when_b_is_greaterthan_a_or_c() {
		double[] expected = {-1.0,-3.0};
		double[] actual = Utility.findQuadratic(1, 4, 3);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void check_when_b_is_lessthan_a_or_c(){
		double[] expected = {1.0,3.0};
		double[] actual = Utility.findQuadratic(1, -4, 3);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void check_when_b_is_equal_to_a(){
		double[] expected = {0.0,0.0};
		double[] actual = Utility.findQuadratic(4, 4, 2);
		assertArrayEquals(expected, actual);
	}
	@Test
	public void check_when_c_is_greaterthan_a_or_b(){
		double[] expected = {-6.0,0.0};
		double[] actual = Utility.findQuadratic(1, 3, 9);
		assertArrayEquals(expected, actual);
	}

	private void assertArrayEquals(double[] expected, double[] actual) {
		// TODO Auto-generated method stub
		
	}

}
