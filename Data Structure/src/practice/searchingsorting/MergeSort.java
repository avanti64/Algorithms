package practice.searchingsorting;

public class MergeSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,10,48,25,40,29,37,45};
		
		System.out.println("Array Before Sorting :");
		display(arr);
		mergeSort(arr,0,arr.length-1);
		System.out.println("Array After Sorting :");
		display(arr);
	}
	
	private static void display(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}
	
	private static void mergeSort(int[] arr,int p,int r){
		if(p < r){
			int q = (p+r)/2;
			mergeSort(arr,p,q);
			mergeSort(arr,q+1,r);
			merge(arr,p,q,r);
		}
	}
	
	private static void merge(int arr[],int p,int q,int r){
		int n1 =  q-p+1;
		int n2 = r-q;
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		//Create left array
		for(int i=0;i<n1;i++)
			left[i] = arr[p+i];
		
		//Create right array
		for(int i=0;i<n2;i++)
			right[i] = arr[i+q+1];
		
		int i=0,j=0;
		int k=p;
		while(i<n1 && j<n2){
			if(left[i] < right[j]){
				arr[k] = left[i];
				i++;
			}
			else{
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k] = left[i];
			k++;
			i++;
		}
		while(j<n2){
			arr[k] = right[j];
			k++;
			j++;
		}		
	}
}
