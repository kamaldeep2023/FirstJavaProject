package pizzaShop;

import java.util.Scanner;

public class Pizza {

	double finalBill;
	String[] pizzaStyle = { "Cheese", "vegetarian", "chicken" };
	String pizzaChoice;
	String size;
	String toppings;
	boolean extraCheese;

	Scanner sc = new Scanner(System.in);

	void pizzaChoice() {
		System.out.println("What pizza would you like? Cheese, Vegetarian OR Chicken");
		pizzaChoice = sc.next();
	}

	void selectToppings() {
		System.out.println("Enter what topping you like");
		toppings = sc.next();
		if (!toppings.equals("pepporoni")) {
			System.out.println("Sorry only pepporoni is available");
		}
		System.out.println("Would you like extra cheese? ");
		extraCheese = sc.nextBoolean();
	}

	String selectPizzaSize() {
		System.out.println("Choose Pizza size");
		size = sc.next();
		return size;

	}

	void calculatePizzaPrice() {

		switch (size) {
		case "Small":
			double billAmount = 15;

			if (toppings.equals("pepporoni") && extraCheese) {
				finalBill = billAmount + 2 + 1;
				System.out.println("Final bill is: " + finalBill);
			} else if (toppings.equals("pepporoni")) {
				finalBill = billAmount + 2;
				System.out.println("Final bill is: " + finalBill);
			} else if (extraCheese) {
				finalBill = billAmount + 1;
				System.out.println("bill is" + finalBill);
			} else {
				System.out.println("Finall bill is : " + billAmount);
			}

			break;

		case "Medium":
			billAmount = 20;

			if (toppings.equals("pepporoni") && extraCheese) {
				finalBill = billAmount + 3 + 1;
				System.out.println("Final bill is: " + finalBill);
			} else if (toppings.equals("pepporoni")) {
				finalBill = billAmount + 3;
				System.out.println("Final bill is: " + finalBill);
			} else if (extraCheese) {
				finalBill = billAmount + 1;
				System.out.println("Bill is: " + finalBill);
			} else {
				System.out.println("Finall bill is : " + billAmount);
			}
			break;

		case "Large":

			billAmount = 25;

			if (toppings.equals("pepporoni") && extraCheese) {
				finalBill = billAmount + 3 + 1;
				System.out.println("Final bill is: " + finalBill);
			} else if (toppings.equals("pepporoni")) {
				finalBill = billAmount + 3;
				System.out.println("Final bill is: " + finalBill);
			} else if (extraCheese) {
				finalBill = billAmount + 1;
				System.out.println("Bill is: " + finalBill);
			} else {
				System.out.println("Finall bill is : " + billAmount);
			}
			break;

		}
	}

}
