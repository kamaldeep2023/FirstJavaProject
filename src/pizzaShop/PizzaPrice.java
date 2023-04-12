package pizzaShop;
import java.util.Scanner;

public class PizzaPrice {

	double finalBill;
	String[] pizzaStyle= {"Cheese","vegetarian","chicken"};
	String pizzaChoice;
	String size;
	String toppings;
	boolean extraCheese;
	
	Scanner sc = new Scanner(System.in);
	
	void calculatePizzaPrice()
	{
		System.out.println("What pizza you like?");
		pizzaChoice= sc.next();
		
		if (pizzaChoice.equals("Cheese"))
		{
			System.out.println("Choose Pizza size");
			size=sc.next();
		switch (size)
		{
		case "Small":
			double billAmount= 15;
			 System.out.println("Enter what topping you like");
			 toppings=sc.next();
			 System.out.println("Would you like extra cheese? ");
			 extraCheese=sc.nextBoolean();
			if(toppings.equals("pepporoni")&& extraCheese)
			{
				finalBill=billAmount+2+1;
				System.out.println("Final bill is: " + finalBill);
			}
			else if(toppings.equals("pepporoni"))
			{
				finalBill=billAmount+2;
				System.out.println("Final bill is: " + finalBill);
			}
			else if(extraCheese)
			{
				finalBill=billAmount+1;
				System.out.println("bill is" + finalBill);
			}
			else
			{
				System.out.println("Finall bill is : " + billAmount);
			}
			
			break;
			
		case "Medium":
			 billAmount=20;
			 System.out.println("Enter what topping you like");
			 toppings=sc.next();
			 System.out.println("Would you like extra cheese? ");
			 extraCheese=sc.nextBoolean();
			 if(toppings.equals("pepporoni") && extraCheese)
				{
					finalBill=billAmount+3+1;
					System.out.println("Final bill is: " + finalBill);
				}
				else if(toppings.equals("pepporoni"))
				{
					finalBill=billAmount+3;
					System.out.println("Final bill is: " + finalBill);
				}
				else if(extraCheese)
				{
					finalBill=billAmount+1;
					System.out.println("Bill is: " + finalBill);
				}
				else
				{
					System.out.println("Finall bill is : " + billAmount);
				}
			 break;
		case "Large":
			
			billAmount=25;
			 System.out.println("Enter what topping you like");
			 toppings=sc.next();
			 System.out.println("Would you like extra cheese? ");
			 extraCheese=sc.nextBoolean();
			 if(toppings.equals("pepporoni")&& extraCheese)
				{
					finalBill=billAmount+3+1;
					System.out.println("Final bill is: " + finalBill);
				}
				else if(toppings.equals("pepporoni"))
				{
					finalBill=billAmount+3;
					System.out.println("Final bill is: " + finalBill);
				}
				else if(extraCheese)
				{
					finalBill=billAmount+1;
					System.out.println("Bill is: " + finalBill);
				}
				else
				{
					System.out.println("Finall bill is : " + billAmount);
				}
			 break;
		default:
			System.out.println("Please enter valid size of pizza ");
				 
		}
		}
		else
		{
			System.out.println("other pizza not available at this moment ");
		}
		
		
	}
}
