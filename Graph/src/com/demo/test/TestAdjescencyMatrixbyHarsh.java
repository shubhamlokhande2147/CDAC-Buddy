package com.demo.test;

import com.demo.beans.AdjescencyMatrixByHarsh;

public class TestAdjescencyMatrixbyHarsh {

	public static void main(String[] args) {
		AdjescencyMatrixByHarsh ob = new AdjescencyMatrixByHarsh(5);
		ob.addEdge(1, 2);
		ob.addEdge(1, 3);
		ob.addEdge(3, 4);
		ob.addEdge(4, 5);
		ob.Display();
		System.out.println();
		ob.removeEdge(1, 3);
		ob.Display();
		System.out.println("tostring method: ");
		System.out.println(ob);
	}

}
