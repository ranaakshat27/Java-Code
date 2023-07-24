package Assignment19;
//6. Write a program to find power of any number using for loop.
import java.util.*;
public class power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pow = 1;
		System.out.println("Enter value: ");
		int value = sc.nextInt();
		System.out.println("Enter power: ");
		int power = sc.nextInt();
		for(int i = 1; i <= power; i++)
		{
			pow = pow*value;
		}
		System.out.println(value+" ^ "+power+" = "+ pow);

	}

}
