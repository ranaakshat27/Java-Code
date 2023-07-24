package Assignment4;
import java.util.*;

public class Key {

	public static void main(String[] args) {
		TreeMap<Integer,String> TreeMap = new TreeMap<Integer,String>();
		TreeMap.put(10, "Bat");
		TreeMap.put(30, "Ball");
		TreeMap.put(50, "Wicket");
		TreeMap.put(70, "Field");
		System.out.println("Input TreeMap Index: "+TreeMap);
		System.out.println("Keys greater than  equal to 30: "+TreeMap.ceilingKey(30));
		System.out.println("Keys greater than  equal to 60: "+TreeMap.ceilingKey(60));
		System.out.println("Keys greater than  equal to 80: "+TreeMap.ceilingKey(80));
	}

}
