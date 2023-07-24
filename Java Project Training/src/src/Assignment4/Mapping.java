package Assignment4;

import java.util.TreeMap;

public class Mapping {

	public static void main(String[] args) {
		TreeMap<Integer,String> TreeMap = new TreeMap<Integer,String>();
		TreeMap.put(1, "Akshat");
		TreeMap.put(5, "Biplav");
		TreeMap.put(7, "Rishu");
		TreeMap.put(10, "Ishika");
		System.out.println("Input TreeMap Index: "+TreeMap);
		System.out.println("Keys greater than  equal to 5: "+TreeMap.ceilingEntry(5));
		System.out.println("Keys greater than  equal to 8: "+TreeMap.ceilingEntry(8));
		System.out.println("Keys greater than  equal to 11: "+TreeMap.ceilingEntry(11));
	}

}

