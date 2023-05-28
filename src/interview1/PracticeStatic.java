package interview1;

import inheritanceExample.override;

public class PracticeStatic extends AbstractPractice {

	/*
	 * public PracticeStatic() {
	 * 
	 * System.out.println("child constructor called");
	 * 
	 * }
	 */
	public int downVariable =9;

	final private int a = 2;
	static private int b;

	static {
		// a=10;
		b = 20;
	}

	static {
		// a=23;
		b = 34;
	}

	public void displayValues() {
		try {
			// a+=2;
			b += 2;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		// finally()

	}

	public static void displayStatic() {

		System.out.println("hi i am static method");
		// System.out.println("a : " +a);
		System.out.println("b : " + b);

	}
	@override
	public void display()
	{
		System.out.println("child class display method");
	}
}
