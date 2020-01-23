package org.arrays;
import java.util.Scanner;

public class GetAndSet2DArrays 

{

	Scanner s = new Scanner(System.in);

	public void set2DArray(int x, int y, int[][] localArray)
	{
		System.out.println("Please enter the elements of the array:");
		for(int i=0; i<x; i++) 
		{
			for(int j=0 ; j<y; j++)
			{
				localArray[i][j] = s.nextInt();
			}
		}
	}
	
	public void get2DArray(int x, int y, int[][] localArray)
	{
		System.out.println("The 2 D Array is:");
		for(int i=0; i<x; i++) 
		{
			for(int j=0 ; j<y; j++)
			{
				System.out.print(localArray[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
		
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		GetAndSet2DArrays g = new GetAndSet2DArrays();
		
		System.out.println("/////////////////////////////////////////////////////");
		System.out.println("");
		System.out.println("           Storing elements in a 2D array");
		System.out.println("");
		System.out.println("/////////////////////////////////////////////////////");
		
		System.out.println("Enter the size of the array m x n one by one:");
		
		int m = s.nextInt();
		int n = s.nextInt();
		
		int[][] twoDimArray = new int[m][n];
		g.set2DArray(m,n, twoDimArray);
		
		g.get2DArray(m,n, twoDimArray);
		
		
		}
	
}

