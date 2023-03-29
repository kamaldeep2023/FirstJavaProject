package assignment1;

public class License {

	int age;
	String licenseType;
	
	void findLicenseType() {
		
		if(age<16)
		{
			System.out.println("Not elegible for license yet");
		}
		else if(age==16)
		{
			System.out.println("You are eligible for G1 License");
		}
	//	else if(age)
		else if (licenseType== "G1")
		{
			System.out.println("Eligible for G2 license");
		}
		else if (licenseType== "G2")
		{
			System.out.println("Eligible for G license");
		}
		else if (licenseType=="G")
		{
			System.out.println("Customer have G license already");
		}
	//	else if (licenseType!="G1" || licenseType!="G2" || licenseType!="G")
		else
			
		{
			System.out.println("Not a valid value of licenseType ");
		}
	}
}
