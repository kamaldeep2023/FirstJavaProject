package arraysExample;

import java.util.Arrays;

public class SortArray {

	int[] numbers= {8,58,6,89,2};
	 
	void sortNumbersDescendingOrder() {
		int swapNumber=0;
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+2;j<numbers.length;j++)
			{
				if(numbers[i]>numbers[j])
				{
				swapNumber=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=swapNumber;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers[1]);
	}
	

}
