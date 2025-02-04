package Java_Practice;

public class Test_immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  	   String st="Sachin";  
	   st.concat(" Tendulkar");//concat() method appends the string at the end  
	   System.out.println(st);//will print Sachin because strings are immutable objects.  
	   // When concatenated it created new string but the variable st still pointing to 
	   // original string not the string created after concatenated.

		//---------------------------------------------
	   String s="Sachin";  
	   s=s.concat(" Tendulkar");  
	   System.out.println(s);  
	   
	   
	}

}
