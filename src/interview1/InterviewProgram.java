package interview1;

import java.util.Arrays;

public class InterviewProgram {

	int[] num = {6,8,34,9,2};
	
	int smallestNumber;
	
	void smallestNumber()
	{
		for(int i =0; i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				smallestNumber=num[i];
				num[i]=num[j];
				num[j]=smallestNumber;				}	
		}
		
		System.out.println("Smallest number" + num [0]);
		System.out.println("Largest number" + num [num.length-1]);
	}
	
	void maxNumber()
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j= i+1;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					int var= num[i];
					num[i]=num[j];
					num[j]=var;			
				}
			}
		}
		
		System.out.println(Arrays.toString(num));
	}
	
	
}
