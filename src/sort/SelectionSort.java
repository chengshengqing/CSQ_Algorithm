package sort;

import java.util.Arrays;

public class SelectionSort {
	public static int[] sort(int[] arr) {
		int n = 0;
		int m = 0;
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				n++;
				if (arr[min] > arr[j]) {
					m++;
					min = j;
				}
			}
			int tepm = arr[i];
			arr[i] = arr[min];
			arr[min] = tepm;
		}
		System.out.println("n========="+n);
		System.out.println("m========="+m);
		return arr;
	}
	
	public static void main(String[] args) {
		/**
		 	200
			n=========19900
			m=========580
		 */
		int[] arr = {1,5,3,77,3,7,4,8,3,44,734,234,8456,234,746};
		System.out.println(arr.length);
		arr = sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
