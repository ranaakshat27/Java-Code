package World;

import Access_Modifier.World;

//class using extends World {                //SubClass
	//void meth2() {
		//System.out.println(a);
		//System.out.println(b);   
		//System.out.println(c);                                  
		//System.out.println(d);
		
	//}
	 
//}

public class Access  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using different package");                 
		World w = new World();                                     //Calling another Package
		//using u = new using();
		//u.meth2();
		
		System.out.println(w.a);   
		//System.out.println(w.b);   
		//System.out.println(w.c);                                  
		//System.out.println(w.d);
				

	}

}
