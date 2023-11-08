package com.demo.test;

import com.demo.beans.MyTask;
import com.demo.thread.MyFactThread;
import com.demo.thread.MytableThread;

public class TestTask {
	public static void main(String[] args) {
		MyTask ob = new MyTask();
		// ob.PrintTable(4);
		// ob.PrintTable(5);

		// System.out.println(ob.factorial(5));

		// Multithreaded by extending thread class
		MytableThread th = new MytableThread(ob, 7);
		th.start();
		th.setPriority(10);
		MytableThread th2 = new MytableThread(ob, 9);
		th.yield();
		th2.start();

		try {
			th.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.yield();
		System.out.println("Th2 Get Priority: " + th2.getPriority());

		MyFactThread obj = new MyFactThread(ob, 5);
		Thread p = new Thread(obj);
		p.start();
		try {
			p.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of main");

	}
}
