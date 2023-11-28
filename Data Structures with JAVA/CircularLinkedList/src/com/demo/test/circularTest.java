package com.demo.test;

import com.demo.beans.circularlinkedlist;

public class circularTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circularlinkedlist list = new circularlinkedlist();
		list.addNodeByPosition(1, 10);
		list.addNodeByPosition(2, 20);
		list.addNodeByPosition(3, 30);
		list.addNodeByPosition(4, 40);
		list.addNodeByPosition(3, 25);
		list.DisplayData();
		list.deleteByKey(20);
		list.deleteByKey(10);
		list.DisplayData();
	}

}
