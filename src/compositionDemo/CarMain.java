package compositionDemo;

public class CarMain {

	public static void main(String[] args) {
		
		Car hondaCivic = new Car("HondaCivic", "White", 5, 30000);
		Car toyota = new Car("Camry", "Black", 5, 40000);
		Car zeep = new Car("Zeep", "Black", 5, 50000);
		System.out.println(zeep);
		
		Dealership ds = new Dealership();
		
	//	ds.addCarsToDealership(hondaCivic);
	
		Car[] carArray= {hondaCivic,toyota,zeep};		
		ds.addCarsToDealership(carArray);
		
	}

}
