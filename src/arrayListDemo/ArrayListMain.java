package arrayListDemo;
import java.util.Scanner;
import java.util.*;
//import java.io.*;
public class ArrayListMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ListExample list = new ListExample();
		list.addNames();
		System.out.println("Enter the name you are looking for :");
		String enteredName= sc.next();
		list.checkNameExist(enteredName);
		
		List<Integer> al = new ArrayList<Integer>();
		
		
	}

}
