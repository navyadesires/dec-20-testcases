package com.mouritech.jsonsample1;

import static org.junit.Assert.*;


import org.junit.Test;

public class SumOfArraysTest {

	 SumOfArrays sum = new SumOfArrays();
	
	@Test
	public  void testSumOfTwoArrays() {
	
		
		assertArrayEquals(new int[] {6,8,10,12},sum.SumOfTwoArrays());
	}
	
	

}