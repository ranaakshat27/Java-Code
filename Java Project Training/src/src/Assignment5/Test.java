package Assignment5;

   public class Arnav {
	
	 int x = 20;
	}
	public class Biplav extends Arnav {
	 int x = 30;
	}
	public class Test {
	
		 public static void main(String[] args) 
	{
	 Biplav b = new Biplav();
	 System.out.println(b.x); 
	 A a = new A();
	 System.out.println(a.x);
	 A a2 = new B();
	 System.out.println(a2.x);
	 }
	}