package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.demo.model.Address;

public class RetriveDataTest {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		//MyUser u1=sess.get(MyUser.class, 10);
		//MyUser u1=sess.load(MyUser.class, 10);
		Address a1=sess.get(Address.class, 1);
		System.out.println("before");
		System.out.println(a1);
		
		Address a2=sess.get(Address.class, 2);
		System.out.println(a2);

		//System.out.println(u1.getUname());
		//System.out.println("after name");
		//System.out.println(u1.getAddr());
		//System.out.println("after");
	}
}
