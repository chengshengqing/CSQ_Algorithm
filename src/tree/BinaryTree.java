package tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	transient static TreeNode root;
	
	public BinaryTree() {
		this.root = new TreeNode(1, "A");
	}
	
	public class TreeNode<T>{
		private int index;
		private TreeNode leftChild;
		private TreeNode rightChild;
		private T date; 
		
		public TreeNode(int index, T date) {
			this.index = index;
			this.leftChild = null;
			this.rightChild = null;
			this.date = date;
		}

		public int getIndex() {
			return index;
		}

		public T getDate() {
			return date;
		}
	}
	
	public void createBinaryTreeNode() {
		TreeNode nodeB = new TreeNode(2, "B");
		TreeNode nodeC = new TreeNode(3, "C");
		TreeNode nodeD = new TreeNode(4, "D");
		TreeNode nodeE = new TreeNode(5, "E");
		TreeNode nodeF = new TreeNode(6, "F");
		root.leftChild = nodeB;
		root.rightChild = nodeC;
		nodeB.leftChild = nodeD;
		nodeB.rightChild = nodeE;
		nodeC.rightChild = nodeF;
	}

	//二叉树的总节点数
	private int getSize() {
		return getSize(root);
	}
	
	private int getSize(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + getSize(node.leftChild) + getSize(node.rightChild);
		}
	}

	//二叉树的高度
	private int getHeight() {
		return getHeight(root);
	}
	
	private int getHeight(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			int i = getHeight(node.leftChild);
			int j = getHeight(node.rightChild);
			return i < j ? j + 1 : i + 1;
		}
	}
	
	//二叉树的前序遍历(递归)   根-左-右
	private void preTree(TreeNode node) {
		if (node == null) {
			return;
		} else {
			System.out.println("TreeNode Previous： "+ node.getDate());
			preTree(node.leftChild);
			preTree(node.rightChild);
		}
	}
	
	//二叉树的前序遍历(栈)  根-左-右
	private void preTreeOfStack(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> node = new Stack<TreeNode>();
		node.push(root);
		while (!node.isEmpty()) {
			TreeNode n = node.pop();
			System.out.println("TreeNode Previous Stack: " + n.getDate());
			if (n.rightChild != null) {
				node.push(n.rightChild);
			}
			if (n.leftChild != null) {
				node.push(n.leftChild);
			}
		}
	}
	
	//反向生成二叉树
	public TreeNode reverseGenerateTree(int size, Queue<String> queue) {
		TreeNode node;
		if (queue == null) {
			return null;
		}
		String d = queue.peek();
		if (d.equals("#")) {
			queue.poll();
			return null;
		}
		int index = size - queue.size();
		node = new TreeNode<String>(index, d);
		if (index == 0) {
			node = root;
		}
		queue.poll();
		node.leftChild = reverseGenerateTree(size, queue);
		node.rightChild = reverseGenerateTree(size, queue);
		return node;
	}

	/**
	 * 创建二叉树字符串队列
	 * ABD###CE##F##
	 */
	public Queue createQueue(String str) {
		Queue<String> queue = new LinkedList<>();
		for (int i = 0; i < str.length(); i++) {
			queue.offer(str.charAt(i) + "");
		}
		return queue;
	}
	
	//执行方法1
	public void initFirst(BinaryTree binaryTree) {
		binaryTree.createBinaryTreeNode();//手动生成二叉树
		int size = binaryTree.getSize();
		System.out.println("treeSize:" + size);
		int height = binaryTree.getHeight();
		System.out.println("treeHeight:" + height);
		binaryTree.preTree(root);
		System.out.println("");
		binaryTree.preTreeOfStack(root);
	}
	
	//执行方法2
	public void initSecond(BinaryTree binaryTree) {
		String str = "ABD###CE##F##";
		Queue<String> queue = binaryTree.createQueue(str);
		/*Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		TreeNode node = binaryTree.reverseGenerateTree(queue.size(), queue);
		binaryTree.preTreeOfStack(root);
	}
	
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.initSecond(binaryTree);
	}
}
