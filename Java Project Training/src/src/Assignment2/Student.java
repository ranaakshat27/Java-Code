package Assignment2;
import java.util.Scanner;

public class Student {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Number of classes held");
	int x = sc.nextInt();
	System.out.println("Number of classes attend");
	int y= sc.nextInt();
	float pf;
	pf=((y*100)/x);
	System.out.println("percentage of class attended:\n "+pf);
	{
	if(pf>= 75) {
		System.out.println("You can sit in exam!");
	}
	else {
	  System.out.println("You cant sit in exam!");
	}
    }
	}
}
