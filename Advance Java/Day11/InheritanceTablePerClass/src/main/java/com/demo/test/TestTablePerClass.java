package com.demo.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.NonPerishableProduct;
import com.demo.model.PerishableProduct;
import com.demo.model.Product;

public class TestTablePerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction td = session.beginTransaction();
		Product product = new Product(99, "Shubham Publication", new Date());
		PerishableProduct p1 = new PerishableProduct(12, "Buscuits", new Date(), new Date());
		NonPerishableProduct n1 = new NonPerishableProduct(13, "chair", new Date(), "Cycle");
		session.save(p1);
		session.save(n1);
		session.save(product);
		td.commit();
		session.close();
		sf.close();
	}

}
