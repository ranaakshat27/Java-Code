package Polymorphism_19thApril;

class parent {
	void print()
	{
		System.out.println("Parent");
	}
}

class child extends parent {
	void print()
	{
		System.out.println("child");
	}
}

class subchild extends parent {
	void print()
	{
		System.out.println("subchild");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent a;
		a = new child();
		a.print();
		
		a = new subchild();
		a.print();

	}

}
