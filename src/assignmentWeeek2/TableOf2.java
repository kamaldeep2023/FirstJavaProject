package assignmentWeeek2;

public class TableOf2 {

	public static void main(String[] args) {
		int number =5;
		int counter=1;
		int productOfNum=number;
		
		System.out.println("Printing table of 2");
		do {
	
			System.out.println(number + "*" + counter+ "="+ productOfNum );
			productOfNum+=number;
			counter++;
			
		}
		while(counter<=10);
			
		

	}

}
