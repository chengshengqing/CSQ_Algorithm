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
		return id[i];
	}
	
	//���ӷ���
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
