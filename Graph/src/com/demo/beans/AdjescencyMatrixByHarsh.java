package com.demo.beans;

public class AdjescencyMatrixByHarsh {
	private int vertices;
	private boolean adjmat[][];

	public AdjescencyMatrixByHarsh(int vertices) {
		this.vertices = vertices;
		adjmat = new boolean[vertices + 1][vertices + 1];
	}

	public void addEdge(int source, int destination) {
		adjmat[source][destination] = true;
		adjmat[destination][source] = true;
	}

	public void removeEdge(int source, int destination) {
		adjmat[source][destination] = false;
		adjmat[destination][source] = false;
	}

	public void Display() {
		for (int i = 1; i < adjmat.length; i++) {
			for (int j = 1; j < adjmat[i].length; j++) {
				if (adjmat[i][j] == true) {
					System.out.print(" 1 ");
				} else {
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < adjmat.length; i++) {
			for (int j = 1; j < adjmat[i].length; j++) {
				sb.append((adjmat[i][j] ? 1 : 0) + "\t");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
