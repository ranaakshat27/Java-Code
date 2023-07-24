package Assignment5;

    class A {
    float salary = 10000;
    }
    
    class B extends A {
    	int bonus = 1000;
    }
    	class Employee {
	public static void main(String args[]) {
		B b = new B();
		System.out.println("Rahul salary is:"+b.salary);
		System.out.println("Bonus of Rahul is:"+b.bonus);
	}
    	}
    