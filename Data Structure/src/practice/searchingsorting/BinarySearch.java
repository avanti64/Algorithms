package practice.searchingsorting;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,12,15,25,29,37,40,45,48,50};
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("Enter element to search in arr :");
		ch = sc.nextInt();
		int index =binarySearch(arr, ch);
		if(index == -1)
			System.out.println("Key not found");
		else
			System.out.println("Key found at index :"+(index+1));
	}
	
	private static int binarySearch(int arr[],int key){
		int first,last;
		first = 0;
		last = arr.length-1;
		while(first <= last){
			int mid = (first + last)/2;
			if(key == arr[mid])
				return mid;
			else if(key < arr[mid])
				last = mid - 1;
			else
				first = mid + 1;
		}
		return -1;
	}

}
