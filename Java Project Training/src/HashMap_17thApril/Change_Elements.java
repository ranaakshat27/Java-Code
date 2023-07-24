package HashMap_17thApril;

import java.util.HashMap;

public class Change_Elements {

	public static void main(String[] args) {
		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "C++");
		System.out.println("Original HashMap: " + languages);
		languages.replace(3, "Perl");
		System.out.println("HashMap using replace(): " + languages);

	}

}
