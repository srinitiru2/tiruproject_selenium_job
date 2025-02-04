package Java_Practice;

public class Test_PrimeNumberCheck {

	public static void main(String[] args) {
		// Prime numbers are natural numbers that are divisible by only 1 and the number itself
		
		int num = 4;
		boolean isPrime = true;
		for(int i = 2; i<=Math.sqrt(num);i++) {
			
			if(num % i ==0) {
				isPrime = false;
				break;
			}
		}
		
		System.out.println(Math.sqrt(num));
		System.out.println("isPrime") ;
		
		
		

	}

}
