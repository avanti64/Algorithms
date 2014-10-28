package test.internship;

public class itoa {


	public static String convert(int x)
	    { 
	        boolean negative = false;
		String s = "";
		if (x == 0) return "0";
		negative = (x<0);
		if (negative) x = -1 * x;
		while (x != 0)
		    { 	
				//Put the character in front 
				s = (char)(48 + (x % 10)) + s;
				//System.out.println((char)(48 + (x % 10)));
				//System.out.println('3'+ '4'+"hssup");
				//System.out.println(s);// add char to front of s
				x = x / 10;     // integer division gives quotient
		    }
		if (negative) s = "-" + s;
			return s;
	    } // convert


	public static void main(String[] args)  // test
	    {
	       int x = 3045;
	       System.out.println(convert(x));
	       x = -103;
	       System.out.println(convert(x));
	    }

	} // end class itoa
