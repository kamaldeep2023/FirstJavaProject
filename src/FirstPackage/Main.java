package FirstPackage;

public class Main {

	public static void main(String[] args) {
		WashingMachine WM = new WashingMachine();
		WM.brandName = "LG";
		WM.loadType = "front";
		WM.modelType = "WM25648";
		WM.isBeep = true;
		WM.minutes = 25;
		WM.Capacity = 2.5f;

		WM.washClothes();
		WM.QuickWash();
		System.out.println("------------------------------------");
		WM.brandName = "Samsung";
		WM.loadType = "Top";
		WM.modelType = "SG56565";
		WM.isBeep = true;
		WM.minutes = 30;
		WM.Capacity = 3.9f;

		WM.washClothes();
		WM.QuickWash();

	}

}
