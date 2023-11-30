package com.demo.beans;

public class AdjescencyMatrix {

	private boolean[][] adjmat;
	private int vertices;

	public AdjescencyMatrix(int vertices) // para constructor
	{
		super();
		this.vertices = vertices;
		adjmat = new boolean[vertices + 1][vertices + 1];
	}

	public void addEdge(int i, int j) {
		adjmat[i][j] = true;
		adjmat[j][j] = true;
	}

	public void removeEdge(int i, int j) {
		adjmat[i][j] = false;
		adjmat[j][j] = false;
	}

	public void display() {
		for (int i = 1; i < adjmat.length; i++) {
			for (int j = 1; j < adjmat[i].length; j++) {
				if (adjmat[i][j] == true) {
					System.out.print("1   ");
				} else {
					System.out.print("0   ");
				}
			}
			System.out.println();
		}

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < adjmat.length; i++) {
			for (int j = 0; j < adjmat[i].length; j++) {
				sb.append((adjmat[i][j] ? 1 : 0) + "\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
