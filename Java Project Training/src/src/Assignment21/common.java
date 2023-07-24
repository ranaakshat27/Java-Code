package Assignment21;

public class common {

	public static void main(String[] args) {
		int[] array1 = {7, 8, 9, 33, 55};
	      int[] array2 = {10, 11, 33, 9, 55, 100};
	      
	      for(int i = 0;i < array1.length; i++) {
	         for(int j = 0; j < array2.length; j++) {
	            if(array1[i] == array2[j]) { 
	               System.out.println(array1[i]);
	            }
	         }
	      }
	}
}