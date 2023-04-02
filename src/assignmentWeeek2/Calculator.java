package assignmentWeeek2;

import java.util.Scanner;

public class Calculator {
	int num;  
	String option;
	
	
	Scanner sc= new Scanner(System.in);
	
	void calculator()
	{ 
		
		System.out.println("Calcuator performs square and cube of a number");
		System.out.println("What would you like to do ? ");
		System.out.println("Please enter Square or cube ");
		option=sc.next();
		

		if (option=="square")
		{
				System.out.println("enter number: ");
				num = sc.nextInt();
				int sqrtNum=num*num;
				System.out.println("Square of a number :" + sqrtNum);
			
		}
		else if (option == "cube")
		{
			System.out.println("enter number" );
			num = sc.nextInt();
			int cubeNum=num*num*num;
			System.out.println("Cube of a number " + cubeNum);
		}
		else
		{
			System.out.println("Invalid Operation");
		}
	}
	
}
 