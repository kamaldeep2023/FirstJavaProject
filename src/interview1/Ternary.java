package interview1;

public class Ternary {

	public static void main(String[] args) {
	
	 int a=23;
	 int b = 45;
	 
	 int res;
	
	res =  a>b?a+b:a-b;
	
	System.out.println(res);
	
	res= b>=a? b: a;
	System.out.println(res);

	}

}
