package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	
	
	    public static void main(String[] args) 
	    { 
	    	Scanner s = new Scanner(System.in);
	    	
	    	System.out.println("Please enter a name: ");
	    	String name = s.next();
	    	
	    	
	    	char charArray[] = name.toCharArray();// name is a string type
	    	//andha name ah vangi adha character array va maathi andha 
	    	//array va chararray nu oru variable la vaikaraom.
	    	
	    	System.out.println("Printing character array"); // op azhaga enna string kuduthomo adhuvae varum
	    	System.out.println(charArray);
	    	//System.out.println("below is a integer array declaration. but when we print the integer array");
	    	//System.out.println("the integers ll not be displayed");
	    	
	    	int intArray[] = {1,3,2};
	    	System.out.println("the integer array is: will not be printed properly");
	    	System.out.println(intArray);
	    	
	    	
	    	System.out.println("The sorted character array is:" );
	    	Arrays.sort(charArray);
	    	System.out.println(charArray);
	    	
	    	System.out.println("the sorted integer array is:");
	    	Arrays.sort(intArray);
	    	System.out.println(intArray);
	    	 //idhula sorted array print varum nu nenaipom. but 
	        //idha print panna value varadhu. some memory adress madiri varum
	  
	        //apa sorted array va print panna naama for loop dhan use pannanum
	         System.out.println("printing sorted int array using for loop");
	         for(int i = 0; i<3;i++)
	         {
	        	 System.out.println(intArray[i]);
	         }
	         
	         // or we cant print the integger array without for loop
	         // adhuku integer array va first tostring kuduthu string ah 
	         //convert pannitu ..apram andha string ah print panna the array will be printed
	        String convertingIntegertoStringArray = Arrays.toString(intArray);
	        System.out.println("printng integer array after coonverting it to string");
	        System.out.println(convertingIntegertoStringArray);
	         int intKey = 2; 
	  
	        System.out.println(intKey 
	                           + " found at index = "
	                           + Arrays 
	                                 .binarySearch(intArray, intKey)); 
	    } 
}

