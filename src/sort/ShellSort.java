package sort;

import java.util.Arrays;

public class ShellSort {
	public static void sort(int[] arr, int h, int len) {
		while (h < len/3) {
			h = 3 * h + 1;
		}
		int i,j;
		while (h >= 1) {
			for (i = h; i < len; i++) {
				int temp = arr[i];
				for (j = i - h; j >= 0 && arr[j] > temp; j -= h) {
					arr[j + h] = arr[j];
				}
				arr[j + h] = temp;
			}
			h = h / 3;
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,1,5,8,3,7,9,3,99,23,12,75};
		sort(arr, 1, arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
