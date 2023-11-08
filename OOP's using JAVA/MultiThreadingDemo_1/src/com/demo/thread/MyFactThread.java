package com.demo.thread;

import com.demo.beans.MyTask;

public class MyFactThread implements Runnable {
	private MyTask obj;
	private int m;

	public MyFactThread(MyTask obj, int m) {
		super();
		this.obj = obj;
		this.m = m;
	}

	@Override
	public void run() {
		obj.factorial(m);
	}

}
