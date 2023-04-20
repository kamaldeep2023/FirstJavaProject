package stringDemo;

public class StringExample {

	String[] cityNames = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington",
			"Kingston", "Kitchener" };

	String officeAddress;

	String findCityName(String findCityName) {
		for (int i = 0; i < cityNames.length; i++) {
			if (cityNames[i].equals(findCityName)) {
				System.out.println("city name found: ");
			} else {
				System.out.println("city not found");
			}
		}
		return findCityName;
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

	void findAddress(String streetAddress, String city, String postalCode) {
		if (officeAddress.contains(streetAddress)) {
			System.out.println("Street Address is : " + streetAddress);
		}
		if (officeAddress.contains(city)) {
			System.out.println("City name is: " + city);
		}
		if (officeAddress.contains(postalCode)) {
			System.out.println("Postal code is: " + postalCode);
		}
	}

}
