package lambda;

import java.util.Arrays;

public class Test {
	
	@org.junit.Test
	public void test() {
		int[] a = {1,1,1,2,2,2,2,3,3,4,5,5,6,6,3,12,3,21,54,2};
		long count = 0;
		count = Arrays.stream(a).filter((x) -> x == 2).count();
		System.out.println(count);
		
		lambdaTest(new LambdaTest<Integer>() {
			
			@Override
			public boolean test() {
				System.out.println("2");
				return false;
			}
		});
		
		lambdaTest(() -> {
			System.out.println("1"); 
			return true;
		});
	}
	
	public void lambdaTest(LambdaTest<Integer> lambda) {
		System.out.println("Hello world");
	}
}
