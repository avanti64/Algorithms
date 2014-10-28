package test.internship;
import java.util.Scanner;
public class tables {
	public static void main(String args[]){
	int n,c;
	System.out.println("Enter number to be multiplied");
	Scanner in  = new Scanner(System.in);
	
	n = in.nextInt();
	
	for(c = 1; c<=10; c++){
		System.out.print(n*c);
	}

}
}