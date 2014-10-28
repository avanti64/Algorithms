package test.internship;

public class Array_leet {

	
	    public static int removeElement(int[] A, int elem) {
	        int i, j = 0;
	        for(i=0; i<A.length; i++){
	            if(A[i]!=elem){
	            A[j] = A[i];
	            j++;
	            }
	        }
	        for(int n = 0 ; n<j ; n++){
	        	System.out.println(A[n]);
	        }
	        return j;
	    }
	    
	    public static void main(String args[]){
	    	int[] myIntArray = new int[]{1,2,3};
	    	System.out.println("Length\n" + removeElement(myIntArray, 3));
	    
	    }
	}

