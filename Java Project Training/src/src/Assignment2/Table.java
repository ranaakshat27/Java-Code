package Assignment2;
import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		int j,n;
		System.out.println("Input the number(Table to be calculated): ");
		{
			System.out.println("Input numbers of terms: ");
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
			System.out.println("\n");
			for(j=0; j<=n; j++)
				System.out.println(n+" X "+j+" = " +n*j);
			}
	}

}
