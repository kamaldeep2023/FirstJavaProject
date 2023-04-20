package assignmentWeek3;

public class CellphonePlansMain {

	public static void main(String[] args) {
		CellphonePlans mobilePlans = new CellphonePlans();
		mobilePlans.selectPhoneBrand();
		
		if(mobilePlans.phoneBrandSelected.equals("Apple"))
		{
			mobilePlans.printApplePhoneNames();
			mobilePlans.selectTelecomBrand();
			mobilePlans.calculatePhonePlanPrice();
			mobilePlans.calculateBill();
			mobilePlans.printcalculatedAmount();
		}
		else if(mobilePlans.phoneBrandSelected.equals("Samsung"))
		{
			mobilePlans.printSamsungPhoneNames();
			mobilePlans.selectTelecomBrand();
			mobilePlans.calculatePhonePlanPrice();
			mobilePlans.calculateBill();
			mobilePlans.printcalculatedAmount();
		}
		else
		{
			System.out.println("Please select either Apple or samsung");
		}
		
		
	}

}
