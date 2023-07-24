package Collections;
import java.util.Stack;
public class stack {

	public static void main(String[] args) {        //LIFO
		Stack<String> Name = new Stack<>();
		Name.push("Abc");
		Name.push("kjh");
		Name.push("uhgd");
		
		System.out.println(Name);
		
		Name.pop();
		System.out.println(Name);

	}

}
