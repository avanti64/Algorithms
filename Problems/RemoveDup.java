package test.internship;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDup {
     public static String removeDup(StringBuilder s)
     {   
    	 HashSet<String> h = new HashSet<String>();
    	 char[] arr = s.toString().toCharArray();
    	 int i, j=0,len=0;
    	 len = s.length();
    	 for (i=0; i < len; i++)
    	 {
    		 if(!h.contains(""+arr[i]))
    		 {    			 
    		     h.add(""+arr[i]);
    			 arr[j]= arr[i];
    			 j++;
    		 }
    	 }
    	 arr[j] = '\0';
    	 System.out.println("S is "+s);
    	 StringBuilder b = new StringBuilder();
    	 String s2  = new String(arr).substring(0,j);
    	 System.out.println("Substring :"+s2);
    	 for(int k =0;k<j;k++)
    		 b.append(arr[k]);
    	 return (b.toString());
    	 
    	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1= new StringBuilder("abaaac");
        //char [] arr = removeDup(s1);
          System.out.println(removeDup(s1));
	}

}
