package test.internship;

class Palindrome {

	


static boolean FindPalindrome(String s){

    int len = s.length();
    char[] arr = s.toCharArray();
    System.out.println(arr);
    System.out.println(arr.length);
    for(int i=0;i<arr.length; i++){
        for(int j=arr.length-1; j<=0; j--){
            if(arr[j]==arr[i]){
                return true;
                }
                else
                    return false;
                
            }
         }
	return true;
     }
        
public static void main(String args[]){
	
	boolean y = FindPalindrome("abac");
	
	if(y){
		System.out.println("YEs");
	}
}
   


    
}
