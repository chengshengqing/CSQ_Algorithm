package sort;

import java.util.Arrays;

public class ThreeSort {
	
	public static int count(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			/*for (int j = a.length - 1; j > i; j--) {
				if (binarySearch(a, -(a[i] + a[j])) > j) {
					//System.out.println(a[i]+ "," + a[j]+"," + -(a[i] + a[j]));
					count++;
				}
			}*/
			for (int j = i + 1; j < a.length; j++) {
				if (binarySearch(a, -(a[i] + a[j])) > j) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static int binarySearch(int[] arr, int n) {
		int first = 0;
		int last = arr.length - 1;
		int middle = 0;
		while (first <= last) {
			middle = first + ((last - first) >> 1);
			if (arr[middle] == n) {
				return middle;
			} else if (arr[middle] > n) {
				last = middle - 1;
			} else if (arr[middle] < n) {
				first = middle + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {-1,-22,-3,-44,-5,-66,-7,-88,-9,0,1,22,3,44,5,66,7,88,9};
		Arrays.sort(arr);
		int count = count(arr);
		System.out.println(count);
	}
}
