package array;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DoubleDemensionalArray {
	public static void main(String[] args) {
		int m = 10;
		int n = 10;
		int[][] array = RandomDoubleDimensionalArray(m, n);
//		System.out.println(Arrays.deepToString(array));
		System.out.println("转置之前：");
		printArrayOfDoubleDimensional(array);
		array = transposition(array);
		System.out.println("转置之后：");
		printArrayOfDoubleDimensional(array);
	}
	
	public static int[][] transposition(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array[i].length; j++) {
				int k = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = k;
				
			}
		}
		return array;
	}
	
	public static void printArrayOfDoubleDimensional(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}
	
	public static int[][] RandomDoubleDimensionalArray(int m, int n) {
		int[][] array = new int[m][n];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
		return array;
	}
}
