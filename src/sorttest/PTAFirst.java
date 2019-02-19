package sorttest;

public class PTAFirst {
	public static void chop(int i, int n) {
		i++;
		if (n % 2 == 0) {
			chop(i, n/2);
		} else if (n != 1 && n % 2 == 1) {
			chop(i, 3 * n + 1);
		} else {
			System.out.println("i==="+ (i - 1));
			return;
		}
	}
	
	public static void main(String[] args) {
		int n = 38;
		if (n < 1000) {
			chop(0,n);
		}
	}
}
