package Access_Modifier;

public class World {                     //Created another package
	
	public int a = 1;
	protected int b = 2;
	int c = 3;
	private double d = 4.5;
	
	public void meth1() {
		System.out.println("Value of a= " + a);    
		System.out.println("Value of b= " + b);
		System.out.println("Value of c= " + c);
		System.out.println("Value of d= " + d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");

	}

}
