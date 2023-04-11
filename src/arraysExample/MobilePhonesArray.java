package arraysExample;

//import java.util.Arrays;
import java.util.Scanner;

public class MobilePhonesArray {

	String[] samsungPhoneBrand = { "S20", "S21", "Flip3", "Fold3" };
	String[] googlePhoneBrand = { "GooglePixel6", "GooglePixel6Pro", "GooglePixelPro", "GooglePixel5" };
	String[] applePhoneBrand = { "Iphone12", "Iphone12mini", "Iphone11", "Iphone12pro" };
	String enteredBrandName;
	String phoneModel;
	Scanner sc = new Scanner(System.in);

	void displayPhones() {
		System.out.println("Enter Brand name (Samsung OR Apple OR Google) of Phone You want to see the list of ");
		enteredBrandName = sc.next();

		switch (enteredBrandName) {
		case "Apple":
			System.out.println("List of Apple Phones available are: "); {
			for (int i = 0; i < applePhoneBrand.length; i++) {

				System.out.println(applePhoneBrand[i]);
			}

			System.out.println("Enter Phone Model you want to buy");
			phoneModel = sc.next();
			switch (phoneModel) {
			case "Iphone12": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}
			case "Iphone12mini": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}
			case "Iphone11": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}
			case "Iphone12pro": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}

			default:
				System.out.println("Invalid Product");
			}

			break;
		}
		case "Samsung":
			System.out.println("List of Samsung Phones available are: "); {
			for (int j = 0; j < samsungPhoneBrand.length; j++) {

				System.out.println(samsungPhoneBrand[j]);
			}
			System.out.println("Enter Phone Model you want to buy");
			phoneModel = sc.next();
			switch (phoneModel) {
			case "S20": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}
			case "S21": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}
			case "Flip3": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}
			case "Fold3": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}
			default:
				System.out.println("Invalid Product");
			}
			break;
		}

		case "Google":
			System.out.println("List of Google Phones available are "); {
			for (int k = 0; k < googlePhoneBrand.length; k++) {
				System.out.println(googlePhoneBrand[k]);
			}
			System.out.println("Enter Phone Model you want to buy");
			phoneModel = sc.next();
			switch (phoneModel) {
			case "GooglePixel6": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}
			case "GooglePixel6Pro": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}
			case "GooglePixelPro": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}
			case "GooglePixel5": {
				System.out.println("Selected Phone model name " + phoneModel);
				break;
			}
			default:
				System.out.println("Invalid Product");
			}
			break;
		}

		default:

			System.out.println("Entered Product is invalid");
		}

	}

}
