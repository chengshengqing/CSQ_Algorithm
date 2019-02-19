package map;

public class HashMapTest<K, V> {
	//默认最小容量
	static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
	//最大容量
	static final int MAXIMUM_CAPACITY = 1 << 30;
	//默认加载因子
	static final float DEFAULT_LOAD_FACTOR = 0.75f;
	//桶中容量超过8由链表转化为红黑树
	static final int TREEIFY_THRESHOLD = 8;
	//桶中容量小于6由红黑树转化为链表
	static final int UNTREEIFY_THRESHOLD = 6;
	//集合中的容量大于64才转化为红黑树，防止集合扩容和转化红黑树相冲突
	static final int MIN_TREEIFY_THRESHOEL = 64;
	//阈值，一般为当前容量*加载因子
	int threshold;
	//加载因子
	int loadFactor;
	//集合
	transient Node<K, V>[] table;
	//集合中键值对的数量
	transient int size;
	//修改次数
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
