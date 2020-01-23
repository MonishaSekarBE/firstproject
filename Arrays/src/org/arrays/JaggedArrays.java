package org.arrays;
import java.util.Scanner;

public class JaggedArrays 
{

	Scanner s = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Jagged Array has many rows. each row has different number of elements");
		System.out.println("");
		
		
		
		System.out.println("Please enter the number of rows : ");
		int m = s.nextInt();
		int array[][] = new int[m][];
		
		int n[] = new int[100];//inndha n ah nama array va decalre panrom
		// so that idhula each row la evlo elements nu
		// user ta input nuber vangara apa andha number ah indha array la store pannikittu
		//later indha array va vachu second for loop la use panniklam
		
		for(int i = 0; i<m; i++) 
		{
			System.out.println("Please enter the number of elements in row: " +(i+1));
			 n[i] = s.nextInt();
			 array[i] = new int[n[i]];// array[0] row la la new 2 elements iruka innoru array ah vaika porom
			
			
			System.out.println("Please enter the elemnts of row " +(i+1));
			for(int j=0; j<n[i]; j++) 
			{
				
				array[i][j] = s.nextInt();
			}
		}
		 System.out.println("Your elements collected successfully");
		 
		 for(int i=0; i<m; i++) 
		 {
			 System.out.println("Row " +(i+1) +" Elements are:");
			 for(int j=0;j<n[i];j++) 
			 {
				
				 System.out.print(array[i][j] +"\t");
			 
		 }
			 System.out.println("");
		
		
	}
	
	}
	}

/*
 * geeksforgeeks website example:
 * class Main 
{ 
    public static void main(String[] args) 
    { 
        // Declaring 2-D array with 2 rows 
        int arr[][] = new int[2][]; 
  
        // Making the above array Jagged 
  
        // First row has 3 columns 
        arr[0] = new int[3]; 
  
        // Second row has 2 columns 
        arr[1] = new int[2]; 
  
        // Initializing array 
        int count = 0; 
        for (int i=0; i<arr.length; i++) 
            for(int j=0; j<arr[i].length; j++) 
                arr[i][j] = count++; 
  
        // Displaying the values of 2D Jagged array 
        System.out.println("Contents of 2D Jagged Array"); 
        for (int i=0; i<arr.length; i++) 
        { 
            for (int j=0; j<arr[i].length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        } 
    } 
} 

*/
