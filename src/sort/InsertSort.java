package sort;

import java.util.Arrays;

public class InsertSort {
	public static int[] sort(int[] arr) {
		int i,j;
		for (i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,1,5,8,3,7,9,3,99,23,12,75};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
