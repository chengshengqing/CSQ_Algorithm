package stack;

public class LinkedStack<Item> {
	private Node first;//ջ��
	private int N;//ջ�ĳ���
	private class Node {
		//�����˽ڵ��Ƕ����
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	};
	
	public int size() {
		return N;
	}
	
	//��ջ��ѹ��Ԫ��
	public void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	
	//ɾ��ջ��Ԫ��
	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
}
