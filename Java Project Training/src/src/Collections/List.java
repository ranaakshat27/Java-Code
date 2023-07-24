package Collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<String> Name = new ArrayList<String>();
		Name.add("Rana");
		Name.add("Rishu");
		Name.add("Ishika");
		System.out.println(Name);
		
		
		Name.add("Tanuja");
		System.out.println(Name);
		
		
		Name.add(0, "Akshat");
		System.out.println(Name);
	}

}
