package hashMapPractice;
import java.util.HashMap;
import java.util.Map;


public class HashMap1 {
	
	static int i =10;
	
	
	
	HashMap<Integer, String> student = new HashMap<Integer,String>();
	
	public void addStudents()
	{ i=50;
		System.out.println("i is :" + i);
		student.put(101, "kamal");
		student.put(102, "kawal");
		student.put(103, "rehmat");
		

		
		for(Map.Entry<Integer, String> student1 : student.entrySet())
		{
			int rollno = student1.getKey();
			String name= student1.getValue();
			
			System.out.println("Key :" + rollno + "Value : " + name);
		}
	}
	
	

	
}
