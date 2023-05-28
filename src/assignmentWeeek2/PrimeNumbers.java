package assignmentWeeek2;

import java.util.Scanner;

public class PrimeNumbers {

	int num;
	boolean flag = true;

	Scanner sc = new Scanner(System.in);

	void isPrimeNumber() {

		System.out.println("Please enter a number to find if it's prime number or not");
		num = sc.nextInt();

		if (num == 0 || num == 1)

			System.out.println("not prime number " + num);
		else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					System.out.println("not a prime number");
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(" prime numbers: " + num);
			}

		}

	}
}
