package assignment1;

public class GreaterNumber {

	int n1 = 5;
	int n2 = 44;
	int n3 = 22;

	void findGreaterNumber()
	{
		if (n1>n2 && n1>n3) 
		{
			System.out.println("Greatest number is : " + n1);
		}
		else if(n2>n3 && n2>n1)
		{
			System.out.println("Greatest number is: " + n2);
		}
		
		else
		{
			System.out.println("Greatest number is :" + n3);
		}
	}

	}
