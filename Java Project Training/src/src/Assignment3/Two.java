package Assignment3;
import java.util.*;
public class Two {

	public static void main(String[] args) {
		try
		{
//		    int []a = {1,2,3,4,5};
//          System.out.println(a[8]);
//			int a = 10/0;
//			System.out.println(a);
			String a= null;
			System.out.println(a.length());
		}
        catch(ArithmeticException e)
		{
        	System.out.println("Invalid number entered by user");
        }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println("out of bond number ");
		}
		catch( Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Error");
		}
		System.out.println("End");
		
	}
}
