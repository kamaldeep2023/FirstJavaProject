package practicePrograms;
import java.util.Arrays;

public class ReplaceNumbersWithAlphabets {
	
 int[] a = {2,3,4,9};
 char aplhabet;
	
	public void replaceNumbers()
	{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>=1 && a[i]<=26)
		{
			int replaceValue = a[i];   // a-z 97 to122 A-Z 65-90
			int asciiValue ='a'+replaceValue;
			aplhabet = (char) asciiValue;
			System.out.println(aplhabet);
		}
		
	}
	}
	
}
