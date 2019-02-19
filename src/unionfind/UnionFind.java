package unionfind;

public class UnionFind {
	private int count;
	private int[] id;
	
	public UnionFind(int n) {
		count = n;
		id = new int[n];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}
	
	//返回连通分量数
	public int count() {
		return count;
	}
	
	//判断是否连接，即是否属于同一个分量
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	
	//查找i所属的连通分量
	public int find(int i) {
		return id[i];
	}
	
	//连接分量
	public void union(int p, int q) {
		int pId = find(p);
		int qId = find(q);
		for (int i = 0; i < id.length; i++) {
			if(id[i] == pId) {
				id[i] = qId;
			}
		}
		count--;
	}
}
