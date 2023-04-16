package assignmentWeek3;

public class CellphonePlansMain {

	public static void main(String[] args) {
		CellphonePlans mobilePlans = new CellphonePlans();
		mobilePlans.selectPhoneBrand();
		
		if(mobilePlans.phoneBrandSelected.equals("Apple"))
		{
			mobilePlans.printApplePhoneNames();
		}
		else
		{
			mobilePlans.printSamsungPhoneNames();
		}
		
		mobilePlans.selectTelecomBrand();
		mobilePlans.calculatePhonePlanPrice();
		mobilePlans.calculateBill();
		mobilePlans.printcalculatedAmount();
	}

}
