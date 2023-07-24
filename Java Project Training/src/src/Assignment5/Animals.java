package Assignment5;

   class Dog {
	  void black()
	  {
		  System.out.println("Black");
	  }
  }
  class Cat extends Dog {
	  void white()
	  {
		  System.out.println("White");
	  }
  }
  class Rat extends Cat {
	  void brown() 
	  {
		  System.out.println("Brown");
	  }
  }
  public class Animals {

	public static void main(String[] args) {
		Rat cu = new Rat();
		cu.black();
		cu.white();
		cu.brown();
		}
}
