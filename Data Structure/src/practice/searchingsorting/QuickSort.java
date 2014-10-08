package practice.searchingsorting;

public class QuickSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,10,48,25,40,29,37,45,50,12};
		
		System.out.println("Array Before Sorting :");
		display(arr);
		quickSort(arr,0,arr.length-1);
		System.out.println("Array After Sorting :");
		display(arr);
	}
	
	private static void display(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}
	
	private static void quickSort(int[] arr,int left,int right){
		int i,j,pivot;
		if(left < right){
			i=left;
			j=right;
			pivot = arr[left];
			while(i < j){
				//Find first greater number from left 
				while(arr[i] <= pivot && i < right)
					i++;
				//find first smaller number from right
				while(arr[j] >= pivot && j > left)
					j--;
				
				if(i < j){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			//Swap pivot with smallest element found
			arr[left] = arr[j];
			arr[j] = pivot;
			
			//Split arr into two partitions
			quickSort(arr,left,j-1);
			quickSort(arr,j+1,right);
		}
		
	}
}
