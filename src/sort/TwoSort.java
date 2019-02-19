package sort;

import java.util.Arrays;

public class TwoSort {
	public static int count(int[] a) {
		int N = a.length;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (binarySearch(a, -a[i]) > i) {
				cnt++;
			}
		}
		return cnt;
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
		int[] a = {1,5,44,8,57,7,-8,48,-5,18,3};
		Arrays.sort(a);
		int count = count(a);
		System.out.println(count);
	}
}
