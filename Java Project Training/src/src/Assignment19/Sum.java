package Assignment19;
        //1. Write a Java program and compute the sum of the digits of an integer.
import java.util.*;
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit:");
		int digit = sc.nextInt();
		int sum = 0;
		while(digit > 0)
		{
			int x = digit % 10;
			sum = sum + x;
			digit = digit/10;
		}
		System.out.println("The Sum is :"+ sum);

	}

}
