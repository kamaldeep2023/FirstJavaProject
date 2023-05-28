package practicePrograms;

public class Factors {

	int num =4;
	int product =1;
	
	void displayFactor()
	{
		System.out.print("Factors of "+ num + ": ");
		for(int i=1;i<=num ;i++)
		{
			if((num%i)==0)
			{
				System.out.println(i + " ");
			}
		}
	}
	
	void displayFactorial()
	{
		for(int i=1;i<=num;i++)
		{
			product*=i;
		}
		System.out.println("Factorial of "+ num + ":" + product);
	}
}
