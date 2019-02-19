package heap;

import java.util.Arrays;
import java.util.Date;

import sun.util.resources.LocaleData;

public class SortTest {
	private int q;
	private int w;
	
	{
		q = 1;
		w = 2;
	}
	
	public SortTest(int q, int w) {
		super();
		this.q = q;
		this.w = w;
	}
	
	public SortTest() {
		super();
	}


	public static void main(String[] args) {
		int t1 = 10;
		int t2 = 3;
		int[] m = new int[t1];
		for (int i = 0; i < m.length; i++) {
			m[i] = i + 1;
		}
		int[] n = new int[t2];
		for (int i = 0; i < n.length; i++) {
			int r = (int)(Math.random() * t1);
			n[i] = m[r];
			for (int j = 0; j < m.length; j++) {
				for (int j2 = m.length - 1; j2 > j; j2--) {
					if (m[j] == m[j2]) {
						System.out.println(m[r]);
					}
				}
			}
			System.out.println("-----------------");
			m[r] = m[t1 - 1];
			t1--;
		}
		Arrays.sort(n);
		System.out.println(Arrays.binarySearch(n, 5));
		for (int i = 0; i < n.length; i++) {
			System.out.println(i + "===" + n[i] + "�±꣺" + i);
		}
	}
}
