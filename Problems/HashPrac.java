	package test.internship;

	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Queue;
	import java.util.Set;

public class HashPrac {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Map<Integer, Boolean> m = new HashMap<Integer, Boolean>();
		//	Map<Integer,Integer> m = new HashMap<Integer,Integer>();
			int arr[] =  {3,2,1,2,2,3};
			int count = 0;
			for(int i = 0; i<arr.length; i++){
				if(m.containsKey(arr[i])){
					System.out.println("Duplicate found " + arr[i]);
				}
				
				else{
					m.put(arr[i], Boolean.TRUE);
				}
				
			}
			
			Iterator it = m.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pairs = (Map.Entry)it.next();
		        System.out.println("Key" + pairs.getKey() + " = " + "Value" + pairs.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }
				
				
			}
			
		}
		
