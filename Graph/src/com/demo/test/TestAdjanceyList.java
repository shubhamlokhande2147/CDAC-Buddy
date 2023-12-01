package com.demo.test;

import com.demo.beans.AdjescencyList;

public class TestAdjanceyList {

	public static void main(String[] args) {
		AdjescencyList ob = new AdjescencyList(5);
		ob.addEdge(1, 2);
		ob.addEdge(1, 3);
		ob.addEdge(2, 4);
		ob.addEdge(3, 4);
		ob.displayData();
		ob.removeEdge(2, 4);
		ob.displayData();
	}

}
