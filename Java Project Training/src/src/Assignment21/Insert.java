package Assignment21;
import java.util.*;

public class Insert {
	
	public static void main(String[] args) {
	int[] my_array = {1, 2, 3, 4, 6, 7};
	int Index_position = 4;
    int newValue    = 5;
    System.out.println("Original Array : "+Arrays.toString(my_array));     
    for(int i=my_array.length-1; i > Index_position; i--){
    my_array[i] = my_array[i-1];
    }
    my_array[Index_position] = newValue;
    System.out.println("New Array: "+Arrays.toString(my_array));
	}
}