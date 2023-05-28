package practicePrograms;

public class Armstrong {
	int number = 153;
	int temp = number;
	double total;

	void isNumberArm() {
		int length = String.valueOf(number).length();

		while (temp != 0) {
			int lastDigit = temp % 10;
			total = total + Math.pow(lastDigit, length);
			temp /= 10;
		}

		if (number == total) {
			System.out.println("Number is armstrong");
		} else {
			System.out.println("Number is not armstrong");
		}
	}
}
