package FirstPackage;

public class WashingMachine {

	String brandName;

	String modelType;

	String loadType;

	String technologyType;

	boolean isBeep;
	int minutes;

	float Capacity;

	void washClothes()

	{
		System.out.println(brandName + modelType + " Washime Machine is of good Quality and have " + Capacity
				+ " cu.ft. capacity");
		System.out.println("Que: Does it beep when wash cycle ends ");
		System.out.println("Answer: " + isBeep);
		System.out.println("it is " + loadType + "load");
	}

	void QuickWash() {

		System.out.println("It has capability to quick wash in " + minutes + " minutes");
	}

}
