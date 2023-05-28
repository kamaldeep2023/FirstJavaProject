package practicePrograms;

public class NaturalNum {

	
	int num =3;
	double sum=0;
	int i = 0;
	
	void sumNumber()
	{
		while(i<=num)
		{
			sum=sum+i;
			i++;
		}
		
		System.out.println("sum is: " + sum);
	}
	
	
}

