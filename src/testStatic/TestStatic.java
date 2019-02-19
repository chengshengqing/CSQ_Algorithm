package testStatic;

public class TestStatic {
	private static String str1;
	private static String str2;
	private int aa;
	private int bb;
	
	
	static {
		str2 = "22";
		System.out.println("str1======="+str1);
		System.out.println("str2======="+str2);
	}
	
	public static void main(String[] args) {
		//staticTest();
	}
	
	
	
	public static void staticTest() {
		System.out.println("str111======="+str1);
		System.out.println("str222======="+str2);
	}

	public TestStatic() {
		System.out.println(111);
	}

	public TestStatic(int aa, int bb) {
		super();
		this.aa = aa;
		this.bb = bb;
		System.out.println(222);
	}
}
