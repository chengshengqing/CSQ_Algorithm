package unionfind;

public class UnionFind2 {
	private int count;// ��ͨ������
	private int[] id;// ÿ������������ͨ����
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
	
	//������ͨ������
	public int count() {
		return count;
	}
	
	//�ж��Ƿ����ӣ����Ƿ�����ͬһ������
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	
	//����i��������ͨ����
	public int find(int i) {
		while(i != id[i]) {
			//i = id[i];
			// ��i�ڵ�ĸ��ڵ�����Ϊ����үү�ڵ�  
	        id[i] = id[id[i]];  
	        i = id[i]; 
		}
		return i;
	}
	
	//���ӷ���
	public void union(int p, int q) {
		int pId = find(p);
		int qId = find(q);
		if (pId == qId) return;
		if (sz[p] < sz[q]) {//ͨ������������ж����Ĵ�С����С������������
			id[p] = qId;
			sz[q] += sz[p];
		} else {
			id[q] = pId;
			sz[p] += sz[q];
		}
		id[q] = pId;
		count--;
	}
	
	//����i��������ͨ����
	/*public int find(int i) {
		return id[i];
	}*/
	
	//���ӷ���
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
