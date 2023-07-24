package Assignment3;
import java.util.*;
public class Fifth {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		try
		{
			System.out.println("Enter first number");
			int x = t.nextInt();
			System.out.println("Enter second number");
			int y = t.nextInt();
			System.out.println(x/y);
		}
		catch(ArithmeticException e)
		{
		e.printStackTrace();
		}
		catch(InputMismatchException e)
		{
		System.out.println(e);
		}

	}

}
