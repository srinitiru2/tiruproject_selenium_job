package Java_Practice;

public class Check_for_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";
		
		String reversed = new StringBuilder(str).reverse().toString();

		System.out.println(str.equals(reversed));

	}

}
