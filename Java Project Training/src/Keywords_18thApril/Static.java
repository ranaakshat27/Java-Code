package Keywords_18thApril;

public class Static {
	                    //static variable
    static int a = 10;
    static int b;
     
                       //static block
    static {
        System.out.println("Static block");
        b = a + 1;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From above:");
	    System.out.println("Value of a= " + a);
	    System.out.println("Value of b= " + b);
	    
	    a = b;

	}

}
