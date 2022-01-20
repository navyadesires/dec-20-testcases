package com.mouritech.jsonsample1;

import java.util.Scanner;

public class DiffArray {

	public int MinDifferenceArray() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int arraySize=sc.nextInt();
		
		
		int array1[] = new int[arraySize];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<array1.length;i++) {
			array1[i]=sc.nextInt();
		}
	
	        int diff1 = Integer.MAX_VALUE; 
	      
	        // Find the min diff by comparing difference 
	        // of all possible pairs in given array 
	        int n=array1.length;
	        for (int i=0; i<n-1; i++) 
	            for (int j=i+1; j<n; j++) 
	                if (Math.abs((array1[i] - array1[j]) )< diff1) 
	                    diff1 = Math.abs((array1[i] - array1[j])); 
	        System.out.println("minimum difference is =" + diff1);
	      
	        // Return min diff     
	        return diff1; 
	    } 
       public int MaxDifferenceArray() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int arraySize=sc.nextInt();
		
		
		int array1[] = new int[arraySize];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<array1.length;i++) {
			array1[i]=sc.nextInt();
		}
	
		int diff2 = Integer.MIN_VALUE;
		 
        int n = array1.length;
        if (n == 0) {
            return diff2;
        }
 
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = i + 1; j < n; j++) {
                if (array1[j] > array1[i]) {
                    diff2 = Integer.max(diff2, array1[j] - array1[i]);
                }
            }
        }
              System.out.println("maximum difference is=" + diff2);
        return diff2;
	    } 
	
	
	
		
	}
	