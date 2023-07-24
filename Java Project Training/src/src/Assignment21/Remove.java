package Assignment21;
import java.util.*;

public class Remove {

	public static void main(String[] args) {
		int[] my_array = {5, 10, 15, 20, 25, 50, 100};
		System.out.println("Original Array : "+Arrays.toString(my_array));     
		   
		   int removeIndex = 0;

		   for(int i = removeIndex; i < my_array.length -1; i++)
		   {
		        my_array[i] = my_array[i + 1];
		   }
		   System.out.println("After removing the first element: "+Arrays.toString(my_array));
	}
}