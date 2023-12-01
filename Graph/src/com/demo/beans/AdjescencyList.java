package com.demo.beans;

public class AdjescencyList {
	private int vertices;
	SinglyLinkedList[] graph;

	public AdjescencyList(int vertices) {
		// TODO Auto-generated constructor stub
		super();
		this.vertices = vertices;
		graph = new SinglyLinkedList[vertices];
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new SinglyLinkedList();
		}
	}

	public void addEdge(int i, int j) {
		graph[i].addAtStart(j);
		graph[j].addAtStart(i);
	}

	public void removeEdge(int i, int j) {
		graph[i].deleteByValue(j);
		graph[j].deleteByValue(i);
	}

	public void displayData() {
		for (int i = 1; i < graph.length; i++) {
			System.out.print(i + "--->");
			graph[i].display();
			System.out.println();
		}
	}
}
