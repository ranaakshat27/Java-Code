package Assignment19;
//2. Write a program to take two numbers as input from user. Display all the odd numbers between the entered numbers m & n.
import java.util.*;
public class OddNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int m = sc.nextInt();
		System.out.println("Enter second number:");
		int n = sc.nextInt();
		while(m<n)
		{
			if(m%2!= 0)
				System.out.println(m+" ");
			m++;
		}

	}

}
