package Exception_Handling;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		      int[] List = {1, 2, 3};
		      System.out.println(List[4]);
	    } 
		catch (Exception e) 
		{
		      System.out.println("Incorrect value");
		} 
		finally 
		{
		      System.out.println("Error: Correct the value");
	    }

	}

}
