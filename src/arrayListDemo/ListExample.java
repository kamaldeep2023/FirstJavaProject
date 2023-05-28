package arrayListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	ArrayList<String> namesList = new ArrayList<String>();

	public void addNames() {
		namesList.add("Kamal");
		namesList.add("Kawal");
		namesList.add("Preet");
		namesList.add("Singh");
		System.out.println(namesList.set(0,"Kawal"));
		System.out.println("Names in the list are: " + namesList);
	}

	public void checkNameExist(String enteredName) {
		if (namesList.contains(enteredName)) {
			System.out.println("name exist in the list");
		}
		else
		{
			System.out.println("name does not exist");
		}
		
	}
	
	

}
