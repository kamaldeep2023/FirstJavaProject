package stringDemo;

public class StringExample {

	String[] cityNames = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington",
			"Kingston", "Kitchener" };

	boolean cityNameFound;

	String streetAddress;
	String cityAddress;
	String postalCode;

	boolean findCityName(String cityToBeFound) {
		for (int i = 0; i < cityNames.length; i++) {
			if (cityToBeFound.equalsIgnoreCase(cityNames[i])) {
				cityNameFound = true;
			}

		}

		return cityNameFound;
	}

	void stringToBeChecked(String substringName) {

		for (int i = 0; i < cityNames.length; i++) {
			if (cityNames[i].endsWith(substringName)) {
				System.out.println("City found Ending with" + " ton" + ": " + cityNames[i]);
			}
		}
	}

	void stringToBeReplaced(String oldSubstringName, String newSubstringName) {

		for (int i = 0; i < cityNames.length; i++) {
			if (cityNames[i].endsWith(oldSubstringName)) {
				String newCityName = cityNames[i].replaceAll(oldSubstringName, newSubstringName);
				System.out.println("CityName changed from " + cityNames[i] + " to " + newCityName);
			}
		}

	}

	/*
	 * void findAddress(String streetAddress, String city, String postalCode) { if
	 * (officeAddress.contains(streetAddress)) {
	 * System.out.println("Street Address is : " + streetAddress); } if
	 * (officeAddress.contains(city)) { System.out.println("City name is: " + city);
	 * } if (officeAddress.contains(postalCode)) {
	 * System.out.println("Postal code is: " + postalCode); } }
	 */

	void extractSubstringFromAddress(String officeAddress) {
		streetAddress = officeAddress.substring(0, officeAddress.indexOf(","));
		System.out.println(streetAddress);

		cityAddress = officeAddress.substring(officeAddress.indexOf("T"), officeAddress.lastIndexOf(","));
		System.out.println(cityAddress);

		postalCode = officeAddress.substring(25, 32);
		System.out.println(postalCode);
	}

	void extractSubstringFromAddressAnotherWay(String officeAddress) {
		streetAddress = officeAddress.substring(0, officeAddress.indexOf(","));
		System.out.println(streetAddress);

		cityAddress = officeAddress.substring(officeAddress.indexOf(",") + 1, officeAddress.lastIndexOf(","));
		System.out.println(cityAddress);

		postalCode = officeAddress.substring(officeAddress.lastIndexOf(",") + 1);
		System.out.println(postalCode);
	}

}
