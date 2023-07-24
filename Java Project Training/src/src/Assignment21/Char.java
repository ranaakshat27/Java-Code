package Assignment21;

public class Char {

	public static void main(String[] args) {
		String str = "Rana Akshat";
	    System.out.println("Original String : " + str);
	    int val1 = str.codePointAt(1);
	    int val2 = str.codePointAt(2);
	        
	    System.out.println("Character(unicode point) = " + val1);
	    
	    System.out.println("Character(unicode point) = " + val2);
	    }
}
