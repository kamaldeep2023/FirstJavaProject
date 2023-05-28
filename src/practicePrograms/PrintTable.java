package practicePrograms;

public class PrintTable {

	int num=10;
	int counter =1;
	int result = num;
	
	public void product()
	{
		do
		{
			System.out.println(num + "*" + counter+ "="+ result);
			result+=num;
			counter++;
		}
		while(counter<=10);
	}
}
