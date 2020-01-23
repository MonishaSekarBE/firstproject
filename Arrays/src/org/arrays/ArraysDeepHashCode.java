package org.arrays;
import java.util.Arrays;

public class ArraysDeepHashCode {

    public static void main(String[] args) 
    { 
  
        // Get the Arrays 
        int intArr[][] = { { 10, 20, 15, 22, 35 } }; 
  
        // Get the second Arrays 
        int intArr1[][] = { { 10, 20, 15, 22, 35 } }; 
        
        System.out.println("equal or not?: " +Arrays.equals(intArr, intArr1));
  
        // To compare both arrays 
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.deepEquals(intArr, intArr1)); 
        
        System.out.println("Integer Array1: "
                + Arrays.deepHashCode(intArr));
        System.out.println("Integer Array2: "
                + Arrays.deepHashCode(intArr1));
        System.out.println("test:" +Arrays.equals(intArr, intArr1)); 
    } 
} 