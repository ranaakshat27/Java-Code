package Coding_Activity;
import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of test cases:");
		int t = sc.nextInt();
		int h = 0;
		int s = 0;
		while(t-->0)
		{
			System.out.println("Enter the value of gold coins:");
			int x = sc.nextInt();
			for(int i = 1; i <= x; i++)
			{
				s = s+i;
				if(s<=x)
				{
					h++;
				}
				else
				{
					break;
				}
			}
			System.out.println(h);
			s = 0;
			h = 0;
		}
	}
}
				
	