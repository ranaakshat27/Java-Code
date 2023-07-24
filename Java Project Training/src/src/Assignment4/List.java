package Assignment4;

import java.util.*;

public class List {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList<String>();
		List.add("Benz");
		List.add("BMW");
		List.add("Audi");
		List.add("Swift");
		
		System.out.println("Original Linked List: "+List);
		System.out.println("Let add the Tata after the Swift: ");
		List.add(4, "Tata");                 // Insert a brand at the first position.
		
		System.out.println("The linked list: "+List);
	}
}


