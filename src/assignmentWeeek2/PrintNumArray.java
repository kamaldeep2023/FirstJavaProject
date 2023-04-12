package assignmentWeeek2;

public class PrintNumArray {
	
	int numberArray[]=new int[5];
	int num=10;
	
    void divisiblenumArray()
    {
    	for(int count=0;count<num;count++)
    	{
    		for(int j=0;j<=count;j++)
    		{
    		if(count%3==0 && count%5==0)
    		{
    			System.out.println(count);
    	
    	    	//	numberArray[j]=count;   	
    		}
    		
    		}
    	
    	}
    }

}
