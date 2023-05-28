package interview2;
import java.util.ArrayList;

public class ConvertString {

	String str = "welcome to the most important interview of the couse"; 
	//Convert a String separated by comma to an arraylist ("Welcome,to,the,most,important,interview,of,the,Co
	
	ArrayList<String> list = new ArrayList<String>();
	
	public void convertString()
	{
		
		String[] str1 = str.split(" ");
		for(int i=1;i<str1.length;i++)
		{
			
			list.add(str1[i]);
			System.out.println(list.get(i));
		}
	}
	
}
