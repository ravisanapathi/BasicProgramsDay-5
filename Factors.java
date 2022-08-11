package powerof2;
import java.util.Scanner;

public class Factors {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a Number");
         
		 int num = scanner.nextInt();
	     System.out.println( "Factors of " + num + " are " );

	     // finding and printing factors b/w 1 to num
	     for(int i = 1; i <= num; i++)
	     {
	         if(num % i == 0)
	             System.out.println(i + " "); 
	     }

	      }

}
