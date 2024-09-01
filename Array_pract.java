/*import java.util.Scanner;

public class Array_pract {

	public static void main(String[] args) {
	Scanner	scan = new Scanner(System.in);
	int[]a = new int[10];
	int i =0;
	for(i=0; i<10; i++)
	{
		System.out.println("Enter the ages:");
		a[i]=scan.nextInt();
		
	}
    	 System.out.println("the ages are:");{
    	 for(i=0;i<10;i++) {
    		 System.out.println(a[i]);
    	 }
    	 scan.close();  
     
	}

	}}*/
import java.util.Scanner;

public class Array_pract {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[10];  // Array of size 10
        
        // Input loop to fill the array
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the age:");
            a[i] = scan.nextInt();  // Store each input in the array
        }
        
        // Output loop to display the ages
        System.out.println("The ages are:");
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);  // Print each value in the array
        }

        scan.close();  // Close the scanner to avoid resource leaks
    }
}
