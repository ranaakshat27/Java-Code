package HashMap_17thApril;

import java.util.HashMap;

public class Access_Elements {

	public static void main(String[] args) {
		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "C++");
		System.out.println("HashMap: " + languages);
		String value = languages.get(1);
		System.out.println("Value at index 1: " + value);
		
	}

}
