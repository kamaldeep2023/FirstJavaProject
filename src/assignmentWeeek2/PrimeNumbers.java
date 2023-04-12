package assignmentWeeek2;

import java.util.Scanner;

public class PrimeNumbers {

	int num;

	Scanner sc=new Scanner(System.in);

	void isPrimeNumber() {
		
		System.out.println("Please enter a number to find if it's prime number or not");
		num=sc.nextInt();
		if (num <= 1) {
			System.out.println(num + " is not a prime Number");
		}
		else {
			for(int counter = 2; counter <= (num/2);counter++)
			{
				if((num%counter)!=0)
				{
					System.out.println(num + " is a Prime Number");
					break;
					
				}
				else
				{
					System.out.println(num + " is not a Prime Number");
					
				}
				
			}
			
		}
	}
}
