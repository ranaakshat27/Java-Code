package Collections;

import java.util.*;

public class Deque {

	public static void main(String[] args) {       //FIFO
		ArrayDeque<String> Name = new ArrayDeque<>();
		Name.push("Abc");
		Name.push("kjh");
		Name.push("uhgd");
		
		System.out.println(Name);
		
		Name.pop();
		System.out.println(Name);

	}

}
