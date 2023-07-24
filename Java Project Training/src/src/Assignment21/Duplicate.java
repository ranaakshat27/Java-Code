package Assignment21;

public class Duplicate {

	public static void main(String[] args) {
		int [] array = new int [] {10, 11, 12, 11, 10, 10, 50};
		System.out.println("Duplicate elements in given array: ");    
        for(int i = 0; i < array.length; i++) {  
        	for(int n = i + 1; n < array.length; n++) {  
                if(array[i] == array[n])
                	System.out.println(array[n]);
            }
        }
	}
}

