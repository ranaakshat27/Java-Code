package Assignment2;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		int i, n, sum = 0;
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Input number: ");
			n = in.nextInt();
		}
		System.out.println("The first n natural numbers are: "+n);
		for(i=1; i<=n; i++)
		{
			System.out.println(i);
			sum +=i;
			}
		System.out.println("The Sum of Naural Number Upto "+n+ " terms = " +sum);
	}

}
