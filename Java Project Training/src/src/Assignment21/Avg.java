package Assignment21;

public class Avg {

	public static void main(String[] args) {
		
		int[] number = new int[]{10, 20, 30, 50, -15, -25,};
	       
	       int sum = 0;
	       for(int i = 0; i < number.length; i++)
	        sum = sum + number[i];
	       
	        double average = sum / number.length;
	        System.out.println("Average value of array elements : " + average); 
	}

}
