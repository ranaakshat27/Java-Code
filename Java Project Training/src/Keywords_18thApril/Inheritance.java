package Keywords_18thApril;

class student {                                       //Single Inheritance
	String name = "Akshat";
}

class Name extends student {
	int ID = 19600;
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n = new Name();
		System.out.println("name: " + n.name + "\nID: " + n.ID);

	}

}
