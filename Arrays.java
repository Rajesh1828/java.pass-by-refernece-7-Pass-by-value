import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
           Scanner scan= new Scanner(System.in);
          /* System.out.println("Enter  the numerator:");
           int a= scan.nextInt();
           System.out.println("ENter the denominator:");
           int b = scan.nextInt();
           int c = a/b;
           System.out.println(c);
           scan.close();*/
           
           int[]a = new int[5];
           int i=0;
           for(i=0;i<5;i++)
           {
        	   System.out.println("Enter the age:");
               a[i]=scan.nextInt();
             
           }
           System.out.println("the age are:");
                for(i=0;i<5;i++)
                {
                	System.out.println(a[i]);                }
           
           
           
           
	}

}
