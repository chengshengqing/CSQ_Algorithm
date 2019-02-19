package bag;

import java.util.Iterator;

public class BagTest {
	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.add(1);
		bag.add(11);
		bag.add(2);
		bag.add(22);
		bag.add(3);
		bag.add(33);
		bag.add(4);
		bag.add(44);
		Iterator iter = bag.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
