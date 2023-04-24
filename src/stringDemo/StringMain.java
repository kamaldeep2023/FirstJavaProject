package stringDemo;

public class StringMain {

	public static void main(String[] args) {
		StringExample stringDemo = new StringExample();

		stringDemo.findCityName("Hamin");

		if (stringDemo.cityNameFound) {
			System.out.println("City is found");
		} else {
			System.out.println("City not found");
		}

		stringDemo.stringToBeChecked("ton");

		stringDemo.stringToBeReplaced("ton", "fun");

		stringDemo.extractSubstringFromAddress("100 queen street,Toronto,M5V 3E3");

		stringDemo.extractSubstringFromAddressAnotherWay("100 queen street,Toronto,M5V 3E3");

	}

}
