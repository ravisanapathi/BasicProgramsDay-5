package practice.empty;

public class SwapOfTwoValues {
	// Java Program to swap two numbers without
	// using temporary variable

		public static void main(String a[]) {
			int x = 15;
			int y = 10;
		    x = x + y;
		    y = x - y; // y = 15
		    x = x - y; // x = 10
		    System.out.println("After Swapping:" + " x = "+x+ " , Y = "+y);
	}

}
