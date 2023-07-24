package Assignment19;
//7. Write a Java program to print the even numbers from 1 to 99. Prints all the numbers in one line  separated by tabs. 
import java.util.*;
public class PrintEvenNo {

	public static void main(String[] args) {
		for(int i = 1; i <= 99; i++)
		{
			if(i%2==0)
			{
				System.out.println("\t"+i);
			}
		}
	}

}
