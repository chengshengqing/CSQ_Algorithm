package graph;

import java.util.Arrays;

public class Graph {
	private static int vertexSize;//�������
	private static int[] vertexArray;//��������
	private static int[][] matrix;//����
	private final static int MAX_WEIGHT = -1;//Ȩ
	
	public Graph(int vertexSize) {
		this.vertexSize = vertexSize;
		vertexArray = new int[vertexSize];//����һά����
		matrix = new int[vertexSize][vertexSize];//������ά����
		for (int i = 0; i < vertexArray.length; i++) {
			vertexArray[i] = i;
		}
	}
	
	public void createMatrix() {
		int[] graph0 = {0, 1, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT};
		int[] graph1 = {0, 0, 2, MAX_WEIGHT, 6};
		int[] graph2 = {7, MAX_WEIGHT, 0, 3, MAX_WEIGHT};
		int[] graph3 = {8, MAX_WEIGHT, MAX_WEIGHT, 0, 4};
		int[] graph4 = {5, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 0};
		matrix[0] = graph0;
		matrix[1] = graph1;
		matrix[2] = graph2;
		matrix[3] = graph3;
		matrix[4] = graph4;
	}
	
	//���ⶥ��Ķ�
	public static int getOutdegree(int index) {
		int degree = 0;
		for (int i = 0; i < matrix[index].length; i++) {
			int weight = matrix[index][i];
			if (weight != 0 && weight != MAX_WEIGHT) {
				degree++;
			}
		}
		return degree;
	}
	
	//���ⶥ�㵽��һ�����Ȩ
	public static int getWeight(int i, int j) {
		int weight = matrix[i][j];
		return weight;
	}
	
	//��ά����ת��
	public static void transposition(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[i].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.createMatrix();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(i + "��" + j + "��Ȩ��" + getWeight(i,j));
			}
			System.out.println("");
		}
		for (int i = 0; i < vertexSize; i++) {
			int OutDegree = getOutdegree(i);
			System.out.println("�±�Ϊ" + i + "�Ķ���ĳ��ȣ�" + OutDegree);
		}
		System.out.println("");
		transposition(matrix);
		for (int i = 0; i < vertexSize; i++) {
			int enterDegree = getOutdegree(i);
			System.out.println("�±�Ϊ" + i + "�Ķ������ȣ�" + enterDegree);
		}
		
	}
}
