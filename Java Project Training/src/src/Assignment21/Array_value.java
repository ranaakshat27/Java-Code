package Assignment21;

public class Array_value {
	
	public static boolean contains(int[] a, int item) {
		
		for (int n : a) {
	         if (item == n) 
	         {
	            return true;
	         }
	      }
	      return false;
	      }
	   public static void main(String[] args) {
	          int[] my_array1 = 
	          {11, 123, 3455, 898, 777, 2000, 5567, 990,};
	          
	      System.out.println(contains(my_array1, 777));
	      System.out.println(contains(my_array1, 999));
	   }
}
