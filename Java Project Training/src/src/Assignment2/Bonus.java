package Assignment2;
import java.util.Scanner;

public class Bonus {
	public static void main(String [] args) {
		int year;
		int sal;
		System.out.println("Enter total number of years of services:" );
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if(year>5)
		{
			System.out.println("Congrats! Your total year of services is more than 5 years\n Please Enter Your Salary:");
			sal=sc.nextInt();
			System.out.println("YOUR SALARY IS: "+sal);
			System.out.println("YOUR 5% BONUS IS: "+sal*0.05);
			System.out.println("YOUR NET BONUS WITH SALARY IS: "+(sal+(sal*0.05)));
		}
		else {
			System.out.println("NO BONUS!");
		}
		
	}

}
