package Assignment19;
import java.util.*;
//8. Write a program to print the Fibonacci series up to first N numbers:
//In Fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of Fibonacci series are 0 and 1.
//eg- First 5 numbers: 1, 2, 3, 5, 8

public class Fibanocci {
	
	public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        int t1 = 0, t2 = 1;
	        System.out.println("Enter the number of terms: ");
	        int n=sc.nextInt();   
	        System.out.println("First " + n + " terms of fibonnaci series: ");
	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(t1 + " ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	    }
	}

	
	          