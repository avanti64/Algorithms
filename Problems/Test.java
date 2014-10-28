package test.internship;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 3;
		char c = 'A';
		char conv = (char)(i + 48);
		int con = c ;
		System.out.println("Char :"+conv);
		System.out.println("Int is :"+con);
		
		charToInt("6489".toCharArray());
		IntToChar(23);
	}
	
	
	public static void charToInt(char[] ch){
		int finalNumber = 0;
		int len  = ch.length;
		for(int i =0; i < ch.length; i++){
			int charToInt = ch[i] - 48;
			finalNumber += (charToInt * Math.pow(10, len - i -1));
		}
		System.out.println("Converted Int :"+finalNumber);
	}
	
	public static void IntToChar(int i){
	    int rev = 0,number;
	    char c; 
	    char arr [] = new char[20];
	    int j=0;
	    while (i != 0){
	    	rev = i % 10; 
	    	i = i/10;
	        System.out.println("int is" + rev);
	    	arr[j] = (char) (rev + 48);
	    	 System.out.println("Char is" + arr[0]);
	    	j++;
	    	
	       
	    }
	    String str = arr.toString();
	    
	    int len = str.length();
	    for (i=len; i< 0; i++)
	    {
	    	
	    }
	   
}
}