package stringDemo;

public class StringMain {

	public static void main(String[] args) {
		StringExample stringDemo = new StringExample();
		
	String printCity=stringDemo.findCityName("Burlington");
	
	System.out.println(printCity);
	
	stringDemo.stringToBeChecked("ton");
	
	stringDemo.stringToBeReplaced("ton","fun");
	
	stringDemo.officeAddress="100 queen street,Toronto,M5V 3E3";
		
	stringDemo.findAddress("100 queen street","Toronto","M5V 3E3");

	}

}
