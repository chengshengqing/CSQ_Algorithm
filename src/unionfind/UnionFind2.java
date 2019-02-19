package unionfind;

public class UnionFind2 {
	private int count;// 连通分量数
	private int[] id;// 每个数所属的连通分量
	int[] sz;
	
	public UnionFind2(int n) {
		count = n;
		id = new int[n];
		sz = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = i;
		}
		for (int i = 0; i < n; i++) {
			sz[i] = i;
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
		while(i != id[i]) {
			//i = id[i];
			// 将i节点的父节点设置为它的爷爷节点  
	        id[i] = id[id[i]];  
	        i = id[i]; 
		}
		return i;
	}
	
	//连接分量
	public void union(int p, int q) {
		int pId = find(p);
		int qId = find(q);
		if (pId == qId) return;
		if (sz[p] < sz[q]) {//通过结点数量，判断树的大小并将小树并到大树下
			id[p] = qId;
			sz[q] += sz[p];
		} else {
			id[q] = pId;
			sz[p] += sz[q];
		}
		id[q] = pId;
		count--;
	}
	
	//查找i所属的连通分量
	/*public int find(int i) {
		return id[i];
	}*/
	
	//连接分量
	/*public void union(int p, int q) {
		int pId = find(p);
		int qId = find(q);
		for (int i = 0; i < id.length; i++) {
			if(id[i] == pId) {
				id[i] = qId;
			}
		}
		count--;
	}*/
	
}
