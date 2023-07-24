package Collections;
import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
			ArrayList<String> Name = new ArrayList<String>();
			Name.add("Rana");
			Name.add("Rishu");
			Name.add("Ishika");
			System.out.println(Name);
			
			
			 Name.remove(1);
	         System.out.println(Name);
	        
	        
	        // Name.set(0, "Ram");
	        // System.out.println(Name);
	        
	       
	      //  System.out.println(Name.get(2));
	        
	        Name.clear();
	        System.out.println(Name);
	}
}
