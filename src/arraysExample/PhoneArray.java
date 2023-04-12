package arraysExample;
import java.util.Scanner;

public class PhoneArray {

	String[] applePhone =new String[2];
	String[] samsungPhone = new String[2];
	String[] google=new String[2];
	String brandName;
	String enteredPhone;
	Scanner sc = new Scanner(System.in);
	
	void enterPhoneNames()
	{
		System.out.println("Enter Brand Name");
	brandName =sc.next();
		for(int i =0;i<applePhone.length;i++)
		{
			System.out.println("Enter model name of Phone");
			applePhone[i] = sc.next();
		}
		System.out.println("Enter Brand Name");
		brandName =sc.next();
		for(int j=0;j<samsungPhone.length;j++)
		{
			System.out.println("Enter model name of Phone");
			samsungPhone[j]=sc.next();
		}
		System.out.println("Enter Brand Name");
		brandName =sc.next();
		for(int k=0;k<google.length;k++)
		{
			System.out.println("Enter model name of Phone");
			google[k]=sc.next();
		}
	}
	
	void printPhoneNames()
	{
		for(int i =0;i<applePhone.length;i++)
		{
			System.out.println("Apple Phones are: "+applePhone[i]);
		}
		
		for(int j=0;j<samsungPhone.length;j++)
		{
			System.out.println("Samsung Phones are: " +samsungPhone[j]);
		}
		
		for(int k=0;k<google.length;k++)
		{
			System.out.println("Google Phones are: " +google[k]);
		}
		
			
		}
	void searchPhone() {
		
		System.out.println("Enter brand name of the phone");
		brandName=sc.next();
		
		
	switch(brandName)
	{
	case "Apple":
	{
		System.out.println("Enter model name from the above list of " + brandName + " phones");
		enteredPhone=sc.next();
		for(int i=0;i<applePhone.length;i++)
		{
			if(enteredPhone.equals(applePhone[i]))
			{
			System.out.println("product selected is: " + enteredPhone);
			
			}
			
		}
		
	break;
	}
	
	case "Samsung":
	{
		System.out.println("Enter model name from the above list of "  + brandName + " phones");
		enteredPhone=sc.next();
		for(int j=0;j<samsungPhone.length;j++)
		{
			if (enteredPhone.equals(samsungPhone[j]))
			{
			System.out.println("product selected is: " + enteredPhone);
			
			
			}
			
		}
		break;
	}
	case "Google":
	{
		System.out.println("Enter model name from the above list of " + brandName + " phones");
		enteredPhone=sc.next();
		for(int k=0;k<google.length;k++)
		{
			if (enteredPhone.equals(google[k]))
			{
			System.out.println("product selected is: " + enteredPhone);
			   
			}
			
		}
		
		break;
		
	}
	
	default:
		
		System.out.println("Invalid Product");
	}
}
}
