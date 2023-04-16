package assignmentWeek3;

import java.util.Scanner;

public class CellphonePlans {

	String[] samsungPhones = { "S22", "S22+", "S22Ultra", "S22FE" };
	int[] samsungPrice = { 25, 35, 55, 20 };
	String[] applePhones = { "iPhone14", "iPhone14Pro", "iPhone14ProMax", "iPhone14Mini" };
	int[] applePrice = { 30, 40, 65, 25 };
	int telecomPrice;
	int phonePrice;
	double finalMonthlyBill;
	String phoneBrandSelected;
	String telecomeBrandSelected;
	String phoneModelSelected;
	Scanner sc = new Scanner(System.in);

	void selectPhoneBrand() {
		System.out.println("Please enter the Brand that you want to choose from: ");
		phoneBrandSelected = sc.next();
	}

	void printSamsungPhoneNames() {
		System.out.println("Please enter the model you want to buy from below: ");
		for (int i = 0; i < samsungPhones.length; i++) {
			System.out.println(samsungPhones[i] + "  Plan per month:  " + "$" + samsungPrice[i] + "/month");
		}
		phoneModelSelected = sc.next();
		
	}

	void calculatePhonePlanPrice() {
		for (int i = 0; i < samsungPhones.length; i++) {
			if (phoneModelSelected.equals(samsungPhones[i])) {
				phonePrice = samsungPrice[i];
			} else if(phoneModelSelected.equals(applePhones[i])) {
				phonePrice = applePrice[i];
			}
		}

	}

	void printApplePhoneNames() {
		System.out.println("Please enter the model you want to buy from below: ");
		for (int i = 0; i < applePhones.length; i++) {
			System.out.println(applePhones[i] + "  Plan per month:  " + "$" + applePrice[i] + "/month");
		}
		phoneModelSelected = sc.next();

	}

	void selectTelecomBrand() {
		System.out.println("Please select the plan that you want to opt for : Rogers/Telus/Bell");
		telecomeBrandSelected = sc.next();
		switch (telecomeBrandSelected) {
		case "Rogers":
			telecomPrice = 70;
			break;
		case "Bell":
			telecomPrice = 80;
			break;
		case "Telus":
			telecomPrice = 75;

		}
	}

	double calculateBill() {
		return finalMonthlyBill = phonePrice + telecomPrice;

	}

	void printcalculatedAmount() {
		System.out.println("You have Selected S22 with " + telecomeBrandSelected + "Plan. ");
		System.out.println("Your Phone Tab will be:          "+phonePrice );
		System.out.println("Your Monthly Plan will be:       "+telecomPrice);
		System.out.println("Total Monthly Amount:             " + finalMonthlyBill);

	}

}
