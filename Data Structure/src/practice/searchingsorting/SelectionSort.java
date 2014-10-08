package practice.searchingsorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,10,48,25,40,29,37,45,50,12};
		
		System.out.println("Array Before Sorting :");
		display(arr);
		selectionSort(arr);
		System.out.println("Array After Sorting :");
		display(arr);
	}
	
	private static void selectionSort(int[] arr){
		int n = arr.length;
		for(int i=0;i<n;i++){
			//Consider small element at ith position
			int small = i;
			//Search for small element compare to element at ith position
			for(int j=i+1;j<n;j++){
				if(arr[small] > arr[j]){
					small = j;
				}
			}
			
			//IF small index is different than i, then found smallest element
			if(small != i){
				int temp = arr[i];
				arr[i] = arr[small];
				arr[small] = temp;
			}
		}
	}
	
	private static void display(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}


}
