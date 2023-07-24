package Assignment21;

public class Iterating {

	public static void main(String[] args) {
		int a[] = {5, 10, 15, 20, 25};
        int b[] = new int[a.length];
  
        b = a;
  
        System.out.println("Elements of array a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
  
        System.out.println("\nElements of array b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
	}
}
