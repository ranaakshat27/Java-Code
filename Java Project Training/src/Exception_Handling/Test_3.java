package Exception_Handling;

public class Test_3 {
	
	static void Voting_Age(int age) {
	    if (age < 18) 
	    {
	      throw new ArithmeticException("Not valid - Age should be at least 18 years");
	    }
	    else 
	    {
	      System.out.println("Valid - Eligible to vote");
	    }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting_Age(17);

	}

}
