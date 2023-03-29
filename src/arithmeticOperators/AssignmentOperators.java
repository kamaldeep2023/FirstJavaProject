package arithmeticOperators;

public class AssignmentOperators {

	int num1 = 40;
	int num2 = 20;
	int sqrtResult;
	int sqrtValue =8;

	void divisionOperation() {
		System.out.println("Quotient of num1 and num2 = " + num1 / num2);
		System.out.println("Remainder of num1 and num2 = " + num1 % num2);
		System.out.println("**********************");
		
		sqrtResult=sqrtValue*=sqrtValue;
		System.out.println("output of square root :" + sqrtResult);
		
		}

	
}
