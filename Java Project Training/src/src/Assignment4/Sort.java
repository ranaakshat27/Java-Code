package Assignment4;
import java.util.*;

public class Sort {

	public static void main(String[] args) {
		ArrayList<Integer> ListStrings = new ArrayList<Integer>();
		ListStrings.add(8);
		ListStrings.add(2);
		ListStrings.add(2345);
		ListStrings.add(5678);
		
		System.out.println("Before Sorting: "+ListStrings);
		Collections.sort(ListStrings);
	    System.out.println("After Sortig: "+ListStrings);
	}
}

