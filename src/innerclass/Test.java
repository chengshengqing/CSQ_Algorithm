package innerclass;

public class Test {
	@org.junit.Test
	public void innerTest() {
		InnerClass innerClass = new InnerClass();
		InnerClass.Bean1 bean1 = innerClass.new Bean1();
		bean1.i++;
		
		InnerClass.Bean2 bean2 = new InnerClass.Bean2();
		bean2.j++;
	}
	
}
