package Assignment21;

public class occurance {

	public static void main(String[] args) {
		String st = "Height of a person!";
	       System.out.println("String: "+st);
	       String str = st.replaceFirst("(?:H)+", "L");
	       System.out.println("String after replacing a characters first occurrence: "+str);
	}
}