package pizzaShop;

public class PizzaMain {

	public static void main(String[] args) {
		
		Pizza pp = new Pizza();
		
		pp.pizzaChoice();
		
		if(pp.pizzaChoice.equals("Cheese"))
		{
			pp.selectPizzaSize();
			if(pp.size.equals("Small")|| pp.size.equals("Medium")||pp.size.equals("Large")) 
			{
			pp.selectToppings();
			pp.calculatePizzaPrice();
			}
			else
			{
				System.out.println("Select valid size of Pizza");
			}
		}
		else {
			System.out.println("other pizza not available at this moment ");
		}
		
		
	}

}
