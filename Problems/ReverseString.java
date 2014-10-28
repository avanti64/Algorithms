package test.internship;

public class ReverseString {
	public static void revString(String s)
	{
		String rev = ""; 
		int len = s.length();
		for(int i=len-1; i >=0; i--){
			
			rev = rev + s.charAt(i);
			
		}
		
		System.out.println("Reversed string is"+ rev);
	}
	
	public static void main(String args[]){
		revString("abcd");
	}

}
