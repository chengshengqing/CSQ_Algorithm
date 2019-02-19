package stack;

public class LinkedStack<Item> {
	private Node first;//栈顶
	private int N;//栈的长度
	private class Node {
		//定义了节点的嵌套类
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	};
	
	public int size() {
		return N;
	}
	
	//向栈顶压入元素
	public void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	
	//删除栈顶元素
	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
}
