package assignmentWeeek2;



// import java.util.Scanner;

public class Chocolates {

	int noOfChocolates=27;
	

	void countChocolates() 
	{
		
		int finalChocolates=63;
		
		System.out.println("Box is full of "+ noOfChocolates+ " chocolates and we will keep adding 5 more chocolates & can't have more than 63 chocolates");
			
		while (noOfChocolates < finalChocolates-5) 
		{  
				
			noOfChocolates+=5;
			if(noOfChocolates<63)
			{
			System.out.println("no of chocolates" + noOfChocolates);
			}
			else
			{
				System.out.println("Box cannot have more than" + finalChocolates);
			}
		}
System.out.println("Total Number of chocolates in box are : " + noOfChocolates);
	}

}
