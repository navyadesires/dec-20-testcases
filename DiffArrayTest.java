package com.mouritech.jsonsample1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DiffArrayTest {

	@Test
	public void testMinDifferenceArray() {
	
		DiffArray dfa = new DiffArray();
		
	  assertEquals(1, dfa.MinDifferenceArray());
	}
	@Test
	public void testMaxDifferenceArray() {
	
		DiffArray dfa = new DiffArray();
		
	  assertEquals(1, dfa.MaxDifferenceArray());
	}
}