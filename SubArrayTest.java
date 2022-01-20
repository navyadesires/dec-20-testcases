package com.mouritech.jsonsample1;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SubArrayTest {

	@Test
	public void testSubArrayBetween() {
		SubArray sub = new SubArray();
		System.out.println(Arrays.toString(sub.SubArrayBetween()));
		assertArrayEquals(new int [] {30,25,40,32,31},sub.SubArrayBetween());
		
	}

}