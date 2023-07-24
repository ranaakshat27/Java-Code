package Assignment4;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("Akshat", 1);
		hashmap.put("Biplav", 2);
		hashmap.put("Rishu", 3);
		hashmap.put("Ishika", 4);
		System.out.println("Input hashMap Index: "+hashmap);
		System.out.println("1. Is Key 'Rishu' exists ? ");
		if(hashmap.containsKey("Rishu"))
		{
			System.out.println("yes! - " + hashmap.get("Rishu"));
		}
		else
		{
			System.out.println("No!");
		}
		System.out.println("\n2. Is Key 'Jeet' exists ? ");
		if(hashmap.containsKey("Jeet"))
		{
			System.out.println("yes! - " + hashmap.get("Jeet"));
		}
		else
		{
			System.out.println("No!");
	    }
	}
}

