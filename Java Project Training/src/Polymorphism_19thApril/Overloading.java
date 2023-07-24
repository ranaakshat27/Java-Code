package Polymorphism_19thApril;

class operator {	
	static int Multiply(int a, int b)              // Method 1, with 2 integer parameters
	{
		return a * b;
	}
	
	static double Multiply(double a, double b, double c)           // Method 2, With same name but with 3 double parameters
	{
		return a * b * c;
	}
					
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(operator.Multiply(5, 6));
        System.out.println(operator.Multiply(5.5, 6.6, 7.7));

	}

}
