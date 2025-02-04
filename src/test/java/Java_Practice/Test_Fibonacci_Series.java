package Java_Practice;

public class Test_Fibonacci_Series {

	public static void main(String[] args) {
		// the series of numbers where each number is the sum of the two preceding
		// numbers.

		int n = 10, num1 = 0, num2 = 1;
		
		System.out.println("Fibonacci Series: " + num1 + "," + num2);
		System.out.println("nnnnnnnnnnnnnnn");
		for (int i = 0; i < n; i++) {
			int num3 = num1 + num2;
			System.out.println("," + num3);
			num1 = num2;
			num2 = num3;

		}
		System.out.println("nnnnnnxxxxxxxxxxxnnnnnnnnn");
	}

}
