package que;

public class LinkedQueue<Item> {
	private Node first;
	private Node last;
	private int N;
	private class Node {
		Item item;
		Node next;
	}
	
	public int size() {
		return N;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	//���β���Ԫ��
	public void enQueue(Item item) {
		Node oldFirst = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last;
		} else {
			oldFirst.next = last;
		}
		N++;
	}
	
	//ɾ����ͷԪ��
	public Item deQueue() {
		Item item = first.item;
		first = first.next;
		if (isEmpty()) {
			last = null;
		}
		N--;
		return item;
	}
}
