package Keywords_18thApril;

public class this_keyword {
	int x;
	
	public this_keyword(int x) {
		this.x = x;                                       //this can be used to refer current class instance variable.                //this() can be used to invoke current class constructor.
	}                                                     //this keyword is used to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_keyword t = new this_keyword(100);
		System.out.println("Print value of x= "+ t.x);

	}

}
