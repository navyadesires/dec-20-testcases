package com.mouritech.jsonsample1;



public class SumOfArrays {


	public int[] SumOfTwoArrays() {
		int array1[] = {1,2,3,4};
		int array2[] = {5,6,7,8};
		int array3[] = new int[4];
		
		for(int i = 0; i< array3.length ; i++) {
			array3[i]=array1[i]+array2[i];
			
		}
		return array3;
		
	}
	
	
}