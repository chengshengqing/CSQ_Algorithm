package heap;
import java.util.ArrayList;
import java.util.List;


/**
 * VM Args£º-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
	static class OOMObject{
		void test1() {
			System.out.println(1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Math.random());
//		Main.test1String();
		OOMObject obj = new OOMObject();
//		System.out.println(obj);
		/*List<OOMObject> list = new ArrayList<OOMObject>();
 
		while (true) {
			list.add(new OOMObject());
		}*/
		/*char t = '1';
		String s = "123456789qwertyu";
		
		System.out.println("123456789qwertyu".indexOf(s));*/
        //s.charAt(1);
//        System.out.println(s.charAt(1));
//        System.out.println(s);
	}

}
