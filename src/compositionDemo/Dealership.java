package compositionDemo;

public class Dealership {

	Car[] carList = new Car[3];
	Car[] carArray = {};

	public void addCarsToDealership(Car carBroughttoDealership) {
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] == null) {
				carList[i] = carBroughttoDealership;
				break;

			}
		}
	}

	public void addCarsToDealership(Car[] carArray) {
		for (int i = 0; i < carList.length; i++) {
			carList[i] = carArray[i];
			System.out.println(carList[i].getBrandName());

		}
	}
}