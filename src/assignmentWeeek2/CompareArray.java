package assignmentWeeek2;

import java.util.Arrays;

public class CompareArray {

	String[] nameArray = {"kamal", "kawal","angel"};
	
	void compareArray() {
		
		for(int i=0;i<nameArray.length;i++)
		{
			if (nameArray[i].equals("kawal"))
			{
				System.out.println(nameArray[i] + " tell me position found at " + i);
			}
		}
	}
	
	
	// create replace method
	
	void replaceNameArray()
	{
		String name ="Rehmat";
		for(int i=0;i<nameArray.length;i++)
		{
			if(nameArray[i].equals("angel"))
			{
				nameArray[i]=name;
				System.out.println("replaced name "+nameArray[i]);
			}
		}
		System.out.println("Print array with all names" + Arrays.toString(nameArray));
	}
	
	void replaceAll()
	{
		String name="rehmat";
		for(int i=0;i<nameArray.length;i++)
		{
			nameArray[i]=name;
		}
		System.out.println(Arrays.toString(nameArray));
	}
}
