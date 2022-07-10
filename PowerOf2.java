package powerof2;
import java.util.Scanner;

public class PowerOf2 {
	
	static int power(int base, int exponent)  
	{  
	int power = 1;  
	//increment the value of i after each iteration until the condition becomes false  
	for (int i = 1; i <= exponent; i++)   
	//calculates power  
	power = power * base;    
	return power;  
	}  
	  
	public static void main(String args[])  {
		
	   int base = 2;	
	   int exponent;  
	   Scanner sc=new Scanner(System.in);  
	   System.out.print("Enter the exponent: ");  
	   exponent=sc.nextInt();  
	   //calling function  
	   int pow=power(base, exponent);  
	   //prints the result  
	   System.out.println(base +" to the power " +exponent + " is: "+pow);  
	}  
}  