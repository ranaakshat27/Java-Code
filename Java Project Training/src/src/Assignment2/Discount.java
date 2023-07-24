package Assignment2;
import java.util.Scanner;

public class Discount {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity:");
		int quant = sc.nextInt();
		int y = quant*100;
		double newcost;
		if(y>1000)
		{
			newcost= y-y*0.10;
			System.out.println("The final cost after getting the discount: "+newcost);
		}
		else
		{
			System.out.println("You are not eligible for discout!");
			System.out.println("the cost: "+y);
		}
	}

}
