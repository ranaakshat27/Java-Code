package Coding_Activity;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of test cases:");
		int t = sc.nextInt();
		while(t-->0);
		{
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y =sc.nextInt();
			String s = sc.next();
			int one = 0;
			int zero = 0;
			for(char C: s.toCharArray())
			{
				if(C == '1')
					one++;
				else
					zero++;
			}
			if(one == 0|| zero == 0)
			{
				System.out.println(0);
			}
			else
			{
				System.out.println(x>y?y: x);
			}
			}
		}
	}
