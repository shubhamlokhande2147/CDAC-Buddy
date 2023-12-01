package com.demo.test;

import com.demo.beans.AdjescencyMatrix;

public class TestAdjescencyMatrix {

	public static void main(String[] args) {

		AdjescencyMatrix ob = new AdjescencyMatrix(5);
		ob.addEdge(1, 2);
		ob.addEdge(1, 3);
		ob.addEdge(2, 4);
		ob.addEdge(3, 4);
		ob.addEdge(3, 3);

// use when matrix class pass only vertices and for loop start with i=0,j=0
//ob.addEdge(0, 1);
//ob.addEdge(1, 2);
//ob.addEdge(1, 3);
//ob.addEdge(2, 3);
//ob.addEdge(2, 2);

		ob.display();
	}

}
