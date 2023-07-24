package HashMap_17thApril;

import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		System.out.println("Input value: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 == 0)
		{
			System.out.println("Congratulations");
		}
		else if (n >= 1 && n <= 20)
		{
			System.out.println("Well done");
		}
		else if (n >= 21 && n <= 27)
		{
			System.out.println("Congratulations");
		}
		else
		{
			System.out.println("Completed");
		}

	}

}
