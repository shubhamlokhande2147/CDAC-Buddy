package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class ProductAnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("prod1", 12, 12123.2323);
		Product p2 = new Product("prod2", 56, 52525.2323);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction td = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		td.commit();
		session.close();
		sf.close();
	}

}
