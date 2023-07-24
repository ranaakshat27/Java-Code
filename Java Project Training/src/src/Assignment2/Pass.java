package Assignment2;
import java.util.Scanner;
public class Pass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input marks of a Subject1:");
		float s1 = sc.nextFloat();
		System.out.println("Input marks of a Subject2:");
		float s2 = sc.nextFloat();
		System.out.println("Input mrks of a Subject3:");
		float s3 = sc.nextFloat();
		
		float sum = s1 + s2+ s3;
		float percentage = (sum/300)*100;
		System.out.println("Total marks obtained:\n"+sum);
		System.out.println("Percentage:\n"+percentage);
		
		if (percentage >=40 && s1 >=33 && s2 >=33 && s3 >=33)
		System.out.println("You are pass!");
		else
			System.out.println("You are fail!");
		
	}

}
