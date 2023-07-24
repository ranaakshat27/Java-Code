package Assignment3;

// Unchanged exception are the exception that are occur at the time of execution. Run time Exception are not allowed to be thrown.
public class Three {
public static void main(String[] args) {
	
	try
	{
		int[]a = {1,2,3,4,5};
		System.out.println(a[8]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception occurs");
	}
	finally 
	{
	System.out.println("End!");
	}

}
}
