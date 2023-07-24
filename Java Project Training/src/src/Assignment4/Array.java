package Assignment4;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		//Create a list and add some brands of cars.
		List<String> ListStrings = new ArrayList<String>();
		ListStrings.add("Benz");
		ListStrings.add("BMW");
		ListStrings.add("Audi");
		ListStrings.add("Swift");
		
		System.out.println(ListStrings);
		
		ListStrings.add(0, "Tata");                 // Insert a brand at the first position.
		
		System.out.println(ListStrings);
	}
}
