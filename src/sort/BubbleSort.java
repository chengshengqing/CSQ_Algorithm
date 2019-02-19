package sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {1,5,3,77,3,7,4,8,3,44,734,234,8456,234,746};
		System.out.println(arr.length);
		arr = sortByBubble(arr);
		System.out.println(Arrays.toString(arr));
		//randomPositive();
		/*int [] array = new int[32];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100) + 1;
		}
		System.out.println("初次生产未排序："+Arrays.toString(array));
		sortByBubble(array);
		System.out.println("排序后："+Arrays.toString(array));*/
	}
	
	public static int[] randomPositive() {
		int[] array;
		for (int i = 1; i < 10; i++) {
			for (int j = 10; j > i; j--) {
				String str1 = "";
				int ii = i;
				while (ii != 0) {
					str1 = ii % 2 + str1;
					ii = ii / 2;
				}
				int jj = j;
				String str2 = "";
				while (jj != 0) {
					str2 = jj % 2 + str2;
					jj = jj / 2;
				}
				String elementOfBinary = (Integer.parseInt(str1) ^ Integer.parseInt(str2)) + "";
				elementOfBinary = flashBlack(elementOfBinary);
				int elementOfDecimalism = 0;
				for (int k = 0; k <= elementOfBinary.length() - 1; k++) {
					//System.out.println("i1===="+elementOfBinary.charAt(elementOfBinary.length() - 1 - k));
					System.out.println(elementOfBinary.charAt(k));
					elementOfDecimalism = (int) Math.pow(elementOfBinary.charAt(k), k);
				}
				
				System.out.println(elementOfDecimalism);
			}
		}
		return null;
	}
	
	public static String flashBlack(String data) {
		String str = "";
		for (int k = 0; k <= data.length() - 1; k++) {
			str = data.charAt(k) + str;
		}
		return str;
	}
	
	public static int[] sortByBubble(int[] array) {
		int n = 0;
		int m = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > i; j--) {
				n++;
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					m++;
				}
			}
		}
		System.out.println("n========="+n);
		System.out.println("m========="+m);
		return array;
	}
}
