package org.arrays;
import java.util.Scanner;

public class GetAndSetObjectArray 

{
	int roll;
	String name1;
	Scanner sc = new Scanner(System.in);
	
	//step 6- constructor called
	GetAndSetObjectArray()
	{
		// step 7 - every index of array ku constructor ll be called. and every
		//index la andha andha student oda details store pannidrom
		roll = sc.nextInt();
		name1 = sc.next();
	
	}
	

	public static void main(String[] args) //step1 main
	{
		Scanner s = new Scanner(System.in);
		 System.out.println("/////////////////////////////////////////////////////");
			System.out.println("");
			System.out.println("           Storing object elements in an array");
			System.out.println("");
			System.out.println("/////////////////////////////////////////////////////");
			System.out.println("");
			System.out.println("Please enter the size of the array:");
			int arraySize = s.nextInt(); //2 - get array size
		
			GetAndSetObjectArray array[] = new GetAndSetObjectArray[arraySize]; // 3- initialize new rray with a size
			
			
			// 4 -enter for loop
			for(int i=0; i<arraySize; i++) 
			{
				System.out.println("Enter student " +(i+1) +" roll no and Name:");
				 array[i] = new GetAndSetObjectArray(); // 5 - array oda every index kum nama oru new object create panram
				 // mela iruka GetAndSetObjectArray() not only creates object. adhu oru constructor
				 // so nama constructor ah vachu oru class ah initialize panraom.
				 //initialize panra apavae adhukulla students details ellame store panrom by calling the constructor.
				 // oru array oda particular index la student oda multiplee details vaikanumna
				 // apa student details ah store panna more than one variable type irukum..like integer for roll number
				 // string for name, etc
				 //appa ovvoru index layum more than one datatype store panrom.
				 //apa ovvoru index layum more than one dataype epdi store panna mudiyum?
				 // adhuku ovvoru index kum new constructor ah call panni andha constructor ah vachu andha class la iruka variables
				 // ah initialize pannidrom
				 //andha class la iruka variable ah nama student details ku thevayaana variables ah  create pannidalam
				 // so ovvoru dhadava constructor ah call panra appavum namma andha constructor iruka class kulla iruka 
				 // student details variables ah initialize panni
				 // andha variables ah array index la store panraom.
			}
			
			System.out.println("done");
			
			System.out.println("The students details are as follows");
			
			for(int i = 0; i < arraySize; i++)
			{
			System.out.println("Roll no of Student " +(i+1) +" is");
			System.out.println(array[i].roll);
			System.out.println("Name of Student " +(i+1) +" is");
			System.out.println(array[i].name1);
			}
			System.out.println(array[0].getClass());
			System.out.println(array[0].getClass().getSuperclass());
	}
	
	
}
