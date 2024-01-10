package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;

public class DepartmentAnnotationTest {
	public static void main(String[] args) {

		Department d1 = new Department("IT");
		Department d2 = new Department("HR");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction td = session.beginTransaction();

		session.save(d1);
		session.save(d2);
		td.commit();
		session.close();

	}

}
