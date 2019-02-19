package testStatic;

import java.util.Arrays;
import java.util.List;

public class TestStatic2 {
	public static void main(String[] args) {
		int [] p = {11,23,4,4,234,23,4,325,4,4,56,53,45,3,6,34,7,567,34,23,4};
		Arrays.sort(p);
		System.out.println(Arrays.toString(p));
		System.out.println(rearchBinary(p, 533));
		
	}
	
	/**
	 * 二分查找法查找元素所对应的数据下标
	 * @param list
	 * @param element
	 * @return 不存在返回-1，存在返回对应数组下标
	 */
	public static int rearchBinary(int[] list, int element) {
		int first = 0;
		int last = list.length -1;
		while (first <= last) {
			int middle = first + (last - first) / 2;
			if (element == list[middle]) {
				return middle;
			} else if (element < list[middle]) {
				last = middle - 1;
			} else if (element > list[middle]) {
				first = middle + 1;
			}
		}
		return -1;
	}
}
