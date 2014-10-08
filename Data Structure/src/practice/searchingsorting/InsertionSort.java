package practice.searchingsorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,10,48,25,40,29,37,45,50,12};
		
		System.out.println("Array Before Sorting :");
		display(arr);
		insertionSort(arr);
		System.out.println("Array After Sorting :");
		display(arr);
	}
	
	private static void display(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}
	
	private static void insertionSort(int[] arr){
		int n = arr.length;
		
		for(int i=1;i<n;i++){
			int key = arr[i];
			//shift elements until right position for key not found
			int j=i-1;
			while(j>-1 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}
