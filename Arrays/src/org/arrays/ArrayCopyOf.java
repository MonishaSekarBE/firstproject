package org.arrays;
import java.util.Arrays;

public class ArrayCopyOf {
	public static void main(String[] args) {
		
		int array[] = { 1, 2,3};
		int array2[] = new int[3];
		array2 = Arrays.copyOf(array, 10); // setting new array length to be 10
		System.out.println("original array is" );
		for(int i=0; i< array.length;i++) {
			System.out.print(array[i] + "\t");
			
			
			
		}
		System.out.println("");
		
		System.out.println("copied array is:");
		for(int i =0; i<array2.length;i++) 
		{
			System.out.print(array2[i] + "\t");
		}
		
		
	}

}
