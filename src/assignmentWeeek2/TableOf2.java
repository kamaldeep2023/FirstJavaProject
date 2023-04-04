package assignmentWeeek2;

public class TableOf2 {

	public static void main(String[] args) {
		int number =2;
		int counter=1;
		int finalNum=number;
		
		System.out.println("Printing table of 2");
		do {
	
			System.out.println(number + "*" + counter+ "="+ finalNum );
			finalNum+=2;
			counter++;
			
		}
		while(counter<=10);
			
		

	}

}
