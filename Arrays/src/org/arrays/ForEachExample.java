package org.arrays;
import java.util.Scanner;

public class ForEachExample 
{
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Finding maximum of the givern number");
	System.out.println("for how many numbers do you want to compare?");
	int num =s.nextInt();
	System.out.println("Please enter the numbers one by one");
	int array[] = new int[num];
	for(int i = 0 ; i<num; i++)
	{
		array[i] = s.nextInt();
		
	}
	
	System.out.println("Input taken --- comparing the given numbers");
	int maxSoFar = array[0];
	
	for( int j : array) 
	{
		
		if(j> maxSoFar)
		{ 
			maxSoFar = j;
	}
}
	System.out.println("The largest number among the given input is: " + maxSoFar); 
 

} }

/* example program given in geeks for geeks
 *   public static void main(String[] arg) 
 
  { 
      { 
          int[] marks = { 125, 132, 95, 116, 110 }; 
            
          int highest_marks = maximum(marks); 
          System.out.println("The highest score is " + highest_marks); 
      } 
  } 
  public static int maximum(int[] numbers) 
  {  
      int maxSoFar = numbers[0]; 
        
      // for each loop 
      for (int num : numbers)  
      { 
      	System.out.println(num);
          if (num > maxSoFar) 
          { 
          	
              maxSoFar = num; 
          } 
      } 
  return maxSoFar; 
  } 
  */