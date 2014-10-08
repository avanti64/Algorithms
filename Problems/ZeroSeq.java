package test.internship;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class ZeroSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		int arr[] =  {4, 7, -2, -3,-2,-1};
		
		int endIndex, startIndex, value;
		endIndex = startIndex = value = -1;
		int sum = 0;
		for(int i=0; i < arr.length; i++){
			sum += arr[i];
			if(!m.containsValue(sum))
				m.put(i, sum);
			else
			{
				endIndex = i;
				value = sum;
			}
		}
		Queue q = new Queue();
		
		Iterator it = m.keySet().iterator();
		while(it.hasNext()){
			int index = (int)it.next();
			if(value == m.get(index)){
				startIndex = index;
				break;
				
			}
		}
			
		System.out.println("Sequence is :"+(startIndex+1) +" till "+endIndex);
		
	}
}