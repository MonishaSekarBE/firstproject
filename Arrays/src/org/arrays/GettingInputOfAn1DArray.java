package org.arrays;
import java.util.Scanner;

public class GettingInputOfAn1DArray 
{
	
	
	
	
	
 public void setArrayElements(int localArraySize, int[] localArray)
 {
	 Scanner s = new Scanner(System.in);
 
	 System.out.println("Please enter the integer elements of the array one by one:");
	 
	 for(int i=0; i<localArraySize; i++)
	 {
		 localArray[i] = s.nextInt();
		 
	 }
	 
	 System.out.println("Array elements are collected successfully!!!");
	 System.out.println("");
 }
 
 public void showArrayElements(int localArraySize, int[] localArray)
 {
	 System.out.println("The array elements are:");
	 
	 for(int j=0; j<localArraySize; j++)
	 {
		 System.out.print(localArray[j]);
		 System.out.print("\t");
		 
	 }
 }
	
	
	
 
 public static void main(String[] args)
 {
	 Scanner s = new Scanner(System.in);
	 GettingInputOfAn1DArray g = new GettingInputOfAn1DArray();
	 
	 System.out.println("/////////////////////////////////////////////////////");
	 System.out.println("");
	 System.out.println("Getting input of elements of an 1 Dimensional array");
	 System.out.println("/////////////////////////////////////////////////////");
	 System.out.println("");
	 
	 
	 System.out.println("Please enter the size or number of elements of the array");
	 System.out.println("Please enter a non zero positive whole number:");
	
	 int  arraySize = s.nextInt();
	 int array[] = new int[arraySize];
	 
	 
	 g.setArrayElements(arraySize, array);
	 g.showArrayElements(arraySize, array);
	 
	 
	 
 }
 
}
