package assignmentWeeek2;

import java.util.Scanner;

public class PrimeBetweenIntervals {

	int firstNumber;
	int secondNumber;
	boolean flag;


	Scanner sc = new Scanner(System.in);

	public void findPrimeBtwInerval() {
		System.out.println("Enter first number");
		firstNumber = sc.nextInt();

		System.out.println("Enter second number");
		secondNumber = sc.nextInt();

		for (int i = firstNumber; i <= secondNumber; i++) {
			if (i == 1 | i == 0)
				continue;
			flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if ((i % j) == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(i);
			}

		}
	}
}
