package quick;

import java.util.Arrays;

public class QuickSort {
	
	public static void sort(int[] arr, int low, int high) {//low/highÎªÏÂ±ê
		if (arr.length <= 0) {
			return;
		}
		int k = arr[low];
		
		while (low < high) {
			while (arr[high] >= k && low < high) {
				high--;
				if (low < high) {
					int temp = arr[high];
					arr[high] = arr[low];
					arr[low] = temp;
				}
				low++;
			}
			while (low < high) {
				if (arr[low] < k) {
					int temp = arr[low];
					arr[low] = arr[high];
					arr[high] = temp;
				}
				low--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {11,4,6,2,7,344,88,45,1,8,4};
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
