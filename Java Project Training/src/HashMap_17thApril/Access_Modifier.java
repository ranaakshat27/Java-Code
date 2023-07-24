package HashMap_17thApril;


class A {
	public int a = 1;
	protected int b = 2;
	int c = 3;
	private double d = 4.5;
	
	public void meth1() {
		System.out.println("Value of a= " + a);    //Yess we can access the value of a(public) in the same class
		System.out.println("Value of b= " + b);    //Yess we can access the value of b(protected) in the same class
		System.out.println("Value of c= " + c);    //Yess we can access the value of c(default) in the same class
		System.out.println("Value of d= " + d);    //Yess we can access the value of d(private) in the same class
	}
}


public class Access_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A A1 = new A();     //Created an object
		A1.meth1();

	}

}
