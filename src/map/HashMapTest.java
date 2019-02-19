package map;

public class HashMapTest<K, V> {
	//Ĭ����С����
	static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
	//�������
	static final int MAXIMUM_CAPACITY = 1 << 30;
	//Ĭ�ϼ�������
	static final float DEFAULT_LOAD_FACTOR = 0.75f;
	//Ͱ����������8������ת��Ϊ�����
	static final int TREEIFY_THRESHOLD = 8;
	//Ͱ������С��6�ɺ����ת��Ϊ����
	static final int UNTREEIFY_THRESHOLD = 6;
	//�����е���������64��ת��Ϊ���������ֹ�������ݺ�ת����������ͻ
	static final int MIN_TREEIFY_THRESHOEL = 64;
	//��ֵ��һ��Ϊ��ǰ����*��������
	int threshold;
	//��������
	int loadFactor;
	//����
	transient Node<K, V>[] table;
	//�����м�ֵ�Ե�����
	transient int size;
	//�޸Ĵ���
	transient int modCount;
	
	static class Node<K, V> {
		final int hash;
		final K key;
		V value;
		Node<K, V> next;
		
		Node(int hash, K key, V value, Node<K, V> next) {
			this.hash = hash;
			this.key = key;
			this.value = value;
			this.next = next;
		}
		
		
	}
}
