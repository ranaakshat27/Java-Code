package Assignment19;
//5. Write a program to print all ASCII character with their values.
import java.util.*;
public class ASCII {

	public static void main(String[] args) {
		for(int i = 0; i<= 255; i++)
		{
			System.out.println("The ASCII "+(char)i+" = " +i);
		}

	}

}
