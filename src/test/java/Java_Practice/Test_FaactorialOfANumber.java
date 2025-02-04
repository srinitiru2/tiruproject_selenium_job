package Java_Practice;

public class Test_FaactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5, factorial = 1;
		for(int i = 1; i<=num; i++) {
			
			factorial= factorial*i;
			
		}
		System.out.println("Factorial of 5: " + factorial);

	}

}
