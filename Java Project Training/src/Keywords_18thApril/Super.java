package Keywords_18thApril;

class Car {                     //Superclass(Parent class)	
	public void Car_Brand() {
	    System.out.println("Multiple Cars");	    
	    }
	}

class BMW extends Car {        //Subclass(child class)
	public void Car_Brand() {
	    super.Car_Brand();     //Call the superclass method
	    System.out.println("BMW ranks 1");	    
	    }
	}

public class Super {                               //The super keyword in java is a reference variable that is used to refer to parent class objects.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car brand = new BMW();              
	    brand.Car_Brand();                  
	    
	}

}
