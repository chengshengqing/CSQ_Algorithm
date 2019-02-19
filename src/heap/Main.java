package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.stream.Collectors;

import test1.User;

public class Main {
	private static int time = 50000;
	private int flag = 1;

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 100000000; i++) {
				list.add("¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ¹þ");
		}
		/*int n = 101010;
		System.out.println(n % 32);
		System.out.println(n & (32 - 1));
		System.out.println(1/2);*/
		/*System.out.println(new Date().getTime()/1000);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new Date().getTime()/1000);*/
		
		/*String waibu = "lambda :";
		List<String> proStrs = Arrays.asList(new String[]{"Ni","Hao","Lambda"});
		List<String>execStrs = proStrs.stream().map(chuandi -> {
			Long zidingyi = System.currentTimeMillis();
			return waibu + chuandi + " -----:" + zidingyi;
		}).collect(Collectors.toList());
		execStrs.forEach(System.out::println);*/
//		System.out.println((char)('a'+4));
//		int[] list = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
//		int element = 10;
		//System.out.println(binarySearch(list, element));
//		binaryToDecimal(10);
//		System.out.println(Math.pow(1, 1));
//		System.out.println(0 * Math.pow(2, 0) + 1 * Math.pow(2, 1) + 0 * Math.pow(2, 2) + 1 * Math.pow(2, 3));
//		System.out.println();
//		System.out.println(age2);
		/*
		 * String age3 = ""; for (int i = age2.length() - 1; i > 0; i--) { age3
		 * += age2[i]; }
		 */
		/*
		 * Person[] p = new Person[3]; User u = new User(1, 2, 3, 4); p[0] = u;
		 * p[1] = new Person(11, 22, 33); System.out.println(p);
		 */
		// testString();
		/*
		 * testStringBuffer(); testStringBuilder(); test1String();
		 * test2String();
		 */
		// main1.sss();

	}
	
	public static int binarySearch(int[] list, int element) {
		int first = 0;
		int last = list.length - 1;
		int i = 0;
		while (first <= last) {
			int middle = first + (last - first) / 2;
			if (element < list[middle]) {
				last = middle - 1;
			} else if (element > list[middle]) {
				first = middle + 1;
			} else {
				System.out.println(i);
				return middle;
			}
			i++;
		}
		return -1;
	}

	public static void binaryToDecimal(int n) {
		String str = "";
		while (n != 0) {
			str = n % 2 + str;
			n = n / 2;
		}
		System.out.println(str);
	}

	public static void getInt(int x) {
		x = x * 3;
	}

	public void sss() {
		testString();
	}

	public static void testString() {
		String s = "";
		testStringBuffer();
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			s += "java";
		}
		long over = System.currentTimeMillis();
		System.out.println("²Ù×÷" + s.getClass().getName() + "ÀàÐÍÊ¹ÓÃµÄÊ±¼äÎª£º" + (over - begin) + "ºÁÃë");
	}

	public static void testStringBuffer() {
		StringBuffer sb = new StringBuffer();
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			sb.append("java");
		}
		long over = System.currentTimeMillis();
		System.out.println("²Ù×÷" + sb.getClass().getName() + "ÀàÐÍÊ¹ÓÃµÄÊ±¼äÎª£º" + (over - begin) + "ºÁÃë");
	}

	public static void testStringBuilder() {
		StringBuilder sb = new StringBuilder();
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			sb.append("java");
		}
		long over = System.currentTimeMillis();
		System.out.println("²Ù×÷" + sb.getClass().getName() + "ÀàÐÍÊ¹ÓÃµÄÊ±¼äÎª£º" + (over - begin) + "ºÁÃë");
	}

	public static void test1String() {
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			String s = "I" + "love" + "java";
		}
		long over = System.currentTimeMillis();
		System.out.println("×Ö·û´®Ö±½ÓÏà¼Ó²Ù×÷£º" + (over - begin) + "ºÁÃë");
	}

	public static void test2String() {
		String s1 = "I";
		String s2 = "love";
		String s3 = "java";
		String s11 = "I";
		String s22 = "love";
		String s33 = "java";
		String s1111 = "I";
		String s2111 = "love";
		String s3111 = "java";
		String s111 = "I";
		String s222 = "love";
		String s333 = "java";
		long begin = System.currentTimeMillis();
		for (int i = 0; i < time; i++) {
			String s = s1 + s2 + s3 + s1 + s2 + s3 + s1 + s2 + s3 + s1 + s2 + s3 + s1 + s2 + s3 + s1 + s2 + s3 + s1 + s2
					+ s3;
		}
		long over = System.currentTimeMillis();
		System.out.println("×Ö·û´®¼ä½ÓÏà¼Ó²Ù×÷£º" + (over - begin) + "ºÁÃë");
	}

}