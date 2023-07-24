package Assignment21;

public class lastOcc {

	public static void main(String[] args) {
		String string = "Java is a programming language !";  
		StringBuffer sb= new StringBuffer(string);  
		sb.deleteCharAt(sb.length()-1);  
		System.out.println(sb);  
		}
}
