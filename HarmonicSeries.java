package powerof2;

class HarmonicSeries {
	
	public static void main(String args[]) {
		int num = 5;
		double result = 0.0;

		System.out.println("The harmonic series is: ");

		// printing the harmonic series till num value
		while (num > 0) {

			result = result + (double)1 / num;

			// after calculating harmonic value
			// decrementing num by 1 which means the common
			// difference is 1
			num--;
			System.out.print(result + ", ");
		}
	}
}