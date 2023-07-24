package Assignment3;
import java.util.*;
public class Four {
	 static void divide() {
		Scanner t = new Scanner(System.in);
		try
		{
			System.out.println("Enter the first number");
			int a = t.nextInt();
			System.out.println("Enter the second number");
			int b = t.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occurs");
			System.out.println("Number cannot be divide");
            throw e;
		}
	}
	public static void main(String[] args) {
		try
		{
			divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Rethrow the Exception");
			System.out.println(e);
		}
		
	}

}
