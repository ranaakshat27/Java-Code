package HashMap_17thApril;


class Package {
	public String a = "Akshat";
	protected String b = "Ishika";
	String c = "Tanuja";
	private String d = "Biplav";
}

public class Access_Modifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Package p = new Package();
		
		System.out.println(p.a);   //public can be accesed from same package another class
		System.out.println(p.b);   //protected can be accesed from another class
		System.out.println(p.c);   //default can be accesed from another class                              
		//System.out.println(p.d); //private can't be accessed in same package from another class

	}
	                               
}
