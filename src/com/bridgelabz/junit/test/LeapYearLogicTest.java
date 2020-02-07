package com.bridgelabz.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgelabz.utils.Utility;

public class LeapYearLogicTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void  testLeapYear_when_value_lessthan_1582() {
		 boolean result = Utility.isLeapYear(1581);
		assertEquals(true,result);
	}
	
	@Test
	  public void leapTestWhen_value_is_2004()
	  {
	    boolean result = Utility.isLeapYear(2004);
	    assertEquals(true, result);
	  }

	  @Test
	  public void leapTestWhen_value_is_1900()
	  {
	    boolean result = Utility.isLeapYear(1900);
	    assertEquals(true, result);
	  }

	  @Test
	  public void leapTestWhen_value_is_2005()
	  {
	    boolean result = Utility.isLeapYear(2005);
	    assertEquals(true, result);
	  }

}
