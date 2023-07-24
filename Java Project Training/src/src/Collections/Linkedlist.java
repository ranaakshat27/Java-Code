package Collections;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> Name = new LinkedList<String>();
		Name.add("Rana");
		Name.add("Rishu");
		Name.add("Ishika");
		System.out.println(Name);
		
		Name.addFirst("Akshat");
		
	    Name.add("Biplav");
	    
		System.out.println(Name);
		
		
		Name.add(3, "Aman");
		System.out.println(Name);
		
		Name.remove();
		System.out.println(Name);

	}

}
