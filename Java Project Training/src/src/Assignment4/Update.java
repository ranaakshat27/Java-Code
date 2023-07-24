package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class Update {

	public static void main(String[] args) {
		List<String> ListStrings = new ArrayList<String>();
		ListStrings.add("Benz");
		ListStrings.add("BMW");
		ListStrings.add("Audi");
		ListStrings.add("Swift");
		
		System.out.println(ListStrings);
		
		ListStrings.set(0, "Tata"); 
		
		System.out.println(ListStrings);
	}
}