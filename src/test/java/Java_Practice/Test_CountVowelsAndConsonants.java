package Java_Practice;

public class Test_CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Automation";
		int vowels = 0, consonants = 0;
		
		System.out.println(str.toCharArray());
		for(char c: str.toCharArray()){
			if("aeiouAEIOU".indexOf(c)!=-1) {
			vowels++;
		}
		else if(Character.isLetter(c)) {
			consonants++;
		}
		}
		System.out.println("Vowels: " + ",Consonants: " + consonants);
		
		
		}
	}


