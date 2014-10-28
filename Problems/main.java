package test.internship;

public class main {
public static int no_of_strings(int s)
{
	if(s<=10) return 1 ; 
	if(s%100<=26 && s%100>=11 && s%100!=20){
		return (no_of_strings(s/100)+no_of_strings(s/10));
	}
	else if(s%100==20 || s%100==10) {
		return (no_of_strings(s/100));
	}
	else {
		return (no_of_strings(s/10));
	}
}

public static void main(String args[])
{
	System.out.println("answer is : " +no_of_strings(1234));
}
}
