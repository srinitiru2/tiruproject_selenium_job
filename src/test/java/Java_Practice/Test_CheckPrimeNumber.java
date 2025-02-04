package Java_Practice;
 
	import java.util.Scanner;

	public class Test_CheckPrimeNumber {
		// Prime numbers are natural numbers that are divisible by only 1 and the number itself
		
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        scanner.close();
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false; // 0 and 1 are not prime numbers
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // found a divisor, so not prime
	            }
	        }
	        return true; // no divisors found, so it is prime
	    }
	}


