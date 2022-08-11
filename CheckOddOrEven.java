package practice.empty;

import java.util.Scanner;

public class CheckOddOrEven {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int x = scanner.nextInt();
	
		
	//int x = 8;
	//int y = 7;
	
	if (x % 2 == 0) {
		System.out.println("Given number is Even");
	}
	else {
		System.out.println("Given Number is Odd");
	}
	}

}
