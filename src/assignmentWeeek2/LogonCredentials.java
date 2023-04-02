package assignmentWeeek2;

import java.util.Scanner;
public class LogonCredentials {
	String userId= "pivotAdmin";
	String password ="Admin123";
	String enteredUserId;
	String enteredPassword;
	
	
	Scanner sc = new Scanner(System.in);
	
	void loginCredentials()
	{
		for(int counter=1;counter<4;counter++)
		{
		System.out.println("Please enter your user id ");
		enteredUserId = sc.next();
		System.out.println("Please enter your Password");
		enteredPassword = sc.next();
		
		if(userId.equals(enteredUserId) && password.equals(enteredPassword))
		//if(userId==enteredUserId && password==enteredPassword)
		{
			System.out.println("You are logged in to the application");
			break;
		}
		
		
		else if (userId!=enteredUserId && password!=enteredPassword && counter<3)
		{
			System.out.println("Incorrect UserID or Password. Try Again" + (3 - counter) + " Attempts remaining");
		}
		else
		{
			System.out.println("Account locked");
		}
		
		}
		
	}
}
