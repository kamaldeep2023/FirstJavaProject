package assignment1;

public class PromoCode {
	
	double productPrice;
	String promoCode;
	
	void discountapplied()
	{
	
	if (promoCode == "Promo5")
		
	{
		System.out.println("Original price of Product is " + productPrice);
		System.out.println("Price of Product with 50% and additional 5% discount applied is " + (productPrice-((productPrice*55)/100)));
	}
	else if (promoCode == "Promo10") 
	{
		System.out.println("Original price of Product is " + productPrice);
		System.out.println("Price of Product with 50% and additional 10% discount applied is " + (productPrice-((productPrice*60)/100)));
	}
	else if (promoCode == "Promo20")
	{
		System.out.println("Original price of Product is " + productPrice);
		System.out.println("Price of Product with 50% and additional 20% discount applied is " + (productPrice-((productPrice*70)/100)));
	}
	else
	{
		System.out.println("Original price of Product is " + productPrice);
		System.out.println("Price of Product is available only at 50% discount which is = " + (productPrice-((productPrice*50)/100)));
	}
}
}