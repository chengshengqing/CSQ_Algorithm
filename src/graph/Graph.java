package graph;

import java.util.Arrays;

public class Graph {
	private static int vertexSize;//顶点个数
	private static int[] vertexArray;//顶点数组
	private static int[][] matrix;//矩阵
	private final static int MAX_WEIGHT = -1;//权
	
	public Graph(int vertexSize) {
		this.vertexSize = vertexSize;
		vertexArray = new int[vertexSize];//创建一维数组
		matrix = new int[vertexSize][vertexSize];//创建二维数组
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
	
	//任意顶点的度
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
	
	//任意顶点到另一顶点的权
	public static int getWeight(int i, int j) {
		int weight = matrix[i][j];
		return weight;
	}
	
	//二维数组转置
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
				System.out.println(i + "到" + j + "的权：" + getWeight(i,j));
			}
			System.out.println("");
		}
		for (int i = 0; i < vertexSize; i++) {
			int OutDegree = getOutdegree(i);
			System.out.println("下标为" + i + "的顶点的出度：" + OutDegree);
		}
		System.out.println("");
		transposition(matrix);
		for (int i = 0; i < vertexSize; i++) {
			int enterDegree = getOutdegree(i);
			System.out.println("下标为" + i + "的顶点的入度：" + enterDegree);
		}
		
	}
}
