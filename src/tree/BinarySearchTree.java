package tree;

import java.util.Stack;

public class BinarySearchTree {
	private TreeNode root;
	
	private class TreeNode {
		private int key;
		private int data;
		private TreeNode leftChild;
		private TreeNode rightChild;
		private TreeNode parent;
		private TreeNode successorNode;//�����ڵ�
		
		public TreeNode(int data) {
			this.data = data;
			key = 0;
			leftChild = null;
			rightChild = null;
			parent = null;
			successorNode = null;
		}
		
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	/**
	 * ���Ԫ�ص�������
	 * @param data
	 */
	public void put(int data) {
		TreeNode node = null;
		if (root == null) {
			node = new TreeNode(data);
			root = node;
			root.successorNode = root;
			return;
		}
		node = root;
		TreeNode parent = null;
		while (node != null) {
			parent = node;
			if (node.data > data) {
				node = node.leftChild;
			} else if (node.data < data) {
				node = node.rightChild;
			}
		}
		node = parent;
		if (node.data > data) {
			node.leftChild = new TreeNode(data);
			node.leftChild.parent = node;
		} else if (node.data < data) {
			node.rightChild = new TreeNode(data);
			node.rightChild.parent = node;
		}
	}
	
	public void midOrderTree() {
		midOrderTree(root);
	}
	
	/**
	 * �������������
	 */
	public void midOrderTree(TreeNode root) {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		TreeNode node = null;
		while (!stack.isEmpty()) {
			while (stack.peek().leftChild != null) {
				stack.push(stack.peek().leftChild);
			}
			while (!stack.isEmpty()) {
				node = stack.pop();
				System.out.println(node.data);
				if (node.rightChild != null) {
					stack.push(node.rightChild);
					break;
				}
			}
		}
	}
	
	/**
	 * ���Һ�̽ڵ�
	 * @param data
	 * @return
	 */
	public TreeNode getSuccessorNode(int data) {
		if (isEmpty()) {
			return null;
		}
		TreeNode node = getNodeForRetrieve(data);
		Stack<TreeNode> stack = new Stack<>();
		stack.push(node.rightChild);
		while (stack.peek().leftChild != null) {
			stack.push(stack.peek().leftChild);
		}
		return stack.pop();
	}
	
	/**
	 * ѭ�����ҽڵ�
	 * @param data
	 * @return
	 */
	public TreeNode getNodeForRetrieve(int data) {
		TreeNode node = root;
		while (node != null) {
			if (node.data > data) {
				node = node.leftChild;
			} else if (node.data < data) {
				node = node.rightChild;
			} else {
				return node;
			}
		}
		System.out.println("�޴˽ڵ�");
		return null;
	}
	
	/**
	 * �ݹ���ҽڵ�
	 * @param data
	 * @return
	 */
	public TreeNode getNodeForRecursion(TreeNode tnode, int data) {
		TreeNode node = tnode;
		if (isEmpty()) {
			return null;
		}
		if (node == null) {
			node = root;
		}
		if (node.data > data) {
			node = root.leftChild;
		} else if (root.data < data) {
			node = root.rightChild;
		} else {
			System.out.println("node���ڵ�Ϊ��"+node.parent.data);
			return node;
		}
		return getNodeForRecursion(node, data);
	}
	
	/**
	 * ɾ���˽ڵ�
	 * @param data
	 */
	private void delete(int data) {
		if (isEmpty()) {
			return;
		}
		TreeNode node = getNodeForRetrieve(data);
		if (node.leftChild == null && node.rightChild == null) {
			if (node.parent.leftChild.data == node.data) {
				node.parent.leftChild = null;
			} else {
				node.parent.rightChild = null;
			}
			return;
		} else if (node.rightChild == null) {
			node.data = node.leftChild.data;
			node.leftChild = null;
			return;
		} else if (node.leftChild == null || (node.leftChild != null && node.rightChild != null)) {
			TreeNode successorNode = getSuccessorNode(data);
			node.data = successorNode.data;
			if (successorNode.parent.leftChild.data == successorNode.data) {
				successorNode.parent.leftChild = null;
			} else {
				successorNode.parent.rightChild = null;
			}
			return;
		}
		
	}
	
	public void initmethodsFirst(BinarySearchTree binarySearchTree) {
		int[] intAray = new int[]{1,9,8,7,55,77,22,33,11,88,75,99,4};
		for (int i : intAray) {
			binarySearchTree.put(i);
		}
		binarySearchTree.midOrderTree();//�������
		int data = 77;
		//binarySearchTree.getNodeForRetrieve(data);//���Ҵνڵ�
		//TreeNode node = binarySearchTree.getSuccessorNode(data);//���Ҵ˽ڵ�ĺ����ڵ�
		//System.out.println(data + "�ĺ����ڵ�ֵΪ��" + node.data);
		binarySearchTree.delete(data);//ɾ���˽ڵ�
		System.out.println("------------");
		binarySearchTree.midOrderTree();//�������
	}
	
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.initmethodsFirst(binarySearchTree);
	}
}
