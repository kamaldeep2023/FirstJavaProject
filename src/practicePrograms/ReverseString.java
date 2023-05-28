package practicePrograms;

public class ReverseString {

	public String originalString = "121";
	public String reverseString = "";
	char reverse;

	public void reverseString() {
		/*
		 * int length = originalString.length() - 1; for (int i = length; i >= 0; i--) {
		 * reverse = originalString.charAt(i); reverseString = reverseString + reverse;
		 * }
		 */
		int length = originalString.length();
		
		for(int i=length-1;i<length;i--)
		{
			reverse = originalString.charAt(i);
			reverseString+=reverse;
			if(i==0)
			{
				break;
			}
		}
		System.out.println(reverseString);
	}

	/*
	 * StringBuilder sbr = new StringBuilder(originalString); public void
	 * reverseString() { System.out.println(sbr.reverse()); reverseString =
	 * sbr.reverse(); }
	 */

	public void isStringPalindrome() {
		if (originalString.equals(reverseString)) {
			System.out.println("yes string is palindrome");
		} else {
			System.out.println("no");
		}
	}
	
	
	

}
