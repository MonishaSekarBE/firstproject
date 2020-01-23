package org.arrays;

import java.util.Arrays; 

public class DeepToString { 
    public static void main(String[] args) 
    { 
  
        // Get the Array 
        int intArr[][] = { { 10, 20, 15, 22, 35 } }; 
        
        System.out.println(intArr);
        System.out.println(Arrays.deepHashCode(intArr));
  
        // To get the deep String of the arrays 
        System.out.println("Integer Array: "
                           + Arrays.deepToString(intArr)); 
    } 
} 