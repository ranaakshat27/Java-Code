package Keywords_18thApril;

class college {
	String name = "Gurukul Kangri";
}

class course extends college {
	String field = "B.tech";
}

class stream extends course {
	String branch = "EEE";
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stream s = new stream();
		System.out.println("name: " + s.name + "\nfield: " + s.field + "\nbranch: " + s.branch);

	}

}
