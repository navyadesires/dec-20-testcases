package com.mouritech.jsonsample1;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {

	//public static void main(String args[]){

		
 public int[]  SubArrayBetween() {
	 int[] a = new int[] {10,12,20,30,25,40,32,31,35,50,60};
	int[] sub = Arrays.copyOfRange(a,3,8);
		return sub;
 }
		
		
}
