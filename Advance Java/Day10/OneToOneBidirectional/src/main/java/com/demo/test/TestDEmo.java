package com.demo.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser;
import com.demo.model.Address;


public class TestDEmo {

	public static void main(String[] args) {
//	  
//		Address addr=new Address(1,"baner","pune");
//		Address addr1=new Address(2,"Deccan","pune");
//		MyUser u1=new MyUser(10,"xxx",addr);
//		MyUser u2=new MyUser(11,"yyy",addr1);
//		SessionFactory sf=new Configuration().configure().buildSessionFactory();
//		Session sess=sf.openSession();
//		Transaction tr=sess.beginTransaction();
//		sess.save(addr);
//		sess.save(addr1);
//		sess.save(u1);
//		sess.save(u2);
//		
		Address addr=new Address();
		addr.setAddrid(1);
		addr.setStreet("baner");
		addr.setCity("pune");
		Address addr1=new Address(2,"Deccan","pune");
		MyUser u1=new MyUser(10,"xxx",addr);
		MyUser u2=new MyUser(11,"yyy",addr1);
		addr.setU(u1);
		addr1.setU(u2);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(addr);
		sess.save(addr1);
		sess.save(u1);
		sess.save(u2);
		tr.commit();


		Session s1=sf.openSession();
		Transaction tr1=s1.beginTransaction();
		//MyUser u1=sess.get(MyUser.class, 10);
		//MyUser u1=sess.load(MyUser.class, 10);
		Address a1=s1.get(Address.class, 1);
		System.out.println("before");
		System.out.println(a1);
		//System.out.println(u1.getUname());
		//System.out.println("after name");
		//System.out.println(u1.getAddr());
		//System.out.println("after");
		
		
		
	}
}
