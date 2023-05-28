package practicePrograms;

public class FindSubstring {

	String str= "Hello World";
	String str2 = "World";
	
	public void finSub()
	{
		if(str.contains(str2))
		{
			System.out.println("yes it is substring");
			System.out.println(str2.toUpperCase());
		}
		else
		{
			System.out.println("no");
		}
	}
	
	public void findLength()
	{
		int length = str.length();
		System.out.println(length);
	}
	
}
