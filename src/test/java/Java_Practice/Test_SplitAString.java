package Java_Practice;

public class Test_SplitAString {

	  public static void main(String args[])

	  {

	  String str = "Simplielearn";
	  
	  String[] arrOfStr = str.split("l", 3);

	  for (String a : arrOfStr)

	  System.out.println(a);

	  }

	}
