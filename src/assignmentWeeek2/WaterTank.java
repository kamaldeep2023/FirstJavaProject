package assignmentWeeek2;
import java.util.Scanner;
public class WaterTank {

	int waterTank;
	int bucketCapacity;
	Scanner sc = new Scanner(System.in);
	
	void fillWaterTank()
	{
		System.out.println("Enter Bucket capacity in Litres");
		bucketCapacity=sc.nextInt();
		
		while(waterTank<=100-bucketCapacity)
		{
			waterTank+=bucketCapacity;
			
			if(waterTank<=100)
			{
				System.out.println("Watertank is full with Litres = " + waterTank);
			
			}
			else
			{
				System.out.println("Watertank cannot have more than 100 Litres" );
			}
		//	System.out.println(waterTank);
		}
		
	}
}
