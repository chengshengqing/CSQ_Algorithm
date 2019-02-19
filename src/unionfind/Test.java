package unionfind;

import java.util.Date;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		int n = 1000000;
		UnionFind uf = new UnionFind(n);
		int count = 0;
		Random rand = new Random();
		long startTime = new Date().getTime()/1000;
		while (count < n) {
			int i = rand.nextInt(n);
			int j = rand.nextInt(n);
			if (uf.connected(i, j)) {
				System.out.println(i+"-"+j+"-----已连通，无需再连");
				count++;
				continue;
			} else {
				uf.union(i, j);
			}
			System.out.println(i+"-"+j);
//			System.out.println("count======"+count);
			count++;
		}
		long endTime = new Date().getTime()/1000;
		System.out.println("uf.count======"+uf.count());
		System.out.println("总耗时======"+(endTime-startTime) + "s");
	}
	
	@org.junit.Test
	public void unionFind() {
		int n = 10000000;
		UnionFind2 uf = new UnionFind2(n);
		int count = 0;
		Random rand = new Random();
		long startTime = new Date().getTime()/1000;
		while (count < n) {
			int i = rand.nextInt(n);
			int j = rand.nextInt(n);
			if (uf.connected(i, j)) {
				System.out.println(i+"-"+j+"-----已连通，无需再连");
				count++;
				continue;
			} else {
				uf.union(i, j);
			}
			System.out.println(i+"-"+j);
//			System.out.println("count======"+count);
			count++;
		}
		long endTime = new Date().getTime()/1000;
		System.out.println("uf.count======"+uf.count());
		System.out.println("总耗时======"+(endTime-startTime) + "s");
	}
}
