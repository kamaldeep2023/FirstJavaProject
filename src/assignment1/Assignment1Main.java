package assignment1;

public class Assignment1Main {

	public static void main(String[] args) {
		
	// Find Greater number 
		
		GreaterNumber GN = new GreaterNumber();   
		GN.findGreaterNumber();
		
		System.out.println ("--------------------");

  // License 
		
		License LN =new License();
		LN.age =16;
		LN.licenseType = "G";
		LN.findLicenseType(); 
		
		System.out.println("-----------------------");
	
		
	// product price 
		
		PromoCode PC =new PromoCode();
		PC.productPrice = 1200;
		PC.promoCode = "Promo20";
		PC.discountapplied();
		PC.promoCode= "Promo10";
		PC.discountapplied();
		PC.promoCode ="Promo5";
		PC.discountapplied();
		PC.promoCode = "null";
		PC.discountapplied();
	}

}
