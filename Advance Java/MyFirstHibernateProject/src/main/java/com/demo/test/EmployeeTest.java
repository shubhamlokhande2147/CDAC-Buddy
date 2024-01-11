package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;
import com.demo.model.MyUser;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "harsh", 34.34);
		Employee e2 = new Employee(2, "adarsh", 56.56);
		// SessionFactory sf = new Configuration().configure().buildSessionFactory();
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		tr.commit();
		session.close();

		// save() for insert data in db
		MyUser m1 = new MyUser(1, "Shubham");
		MyUser m2 = new MyUser(2, "Omkar");
		MyUser m3 = new MyUser(3, "Vivek");
		// SessionFactory sf1 = new Configuration().configure().buildSessionFactory();
		Session session2 = sf.openSession();
		Transaction tr2 = session2.beginTransaction();
		session2.save(m1);
		session2.save(m2);
		session2.save(m3);
		tr2.commit();
		session2.close();

		// get() and load() for fetch data from db
		// getting difference between load and get
		Session nf = sf.openSession();
		Transaction td = nf.beginTransaction();
		Employee emp1 = nf.get(Employee.class, 1); // proper or early binding
		Employee emp2 = nf.load(Employee.class, 2); // lazy binding
		System.out.println("Before");
		System.out.println(emp1.getEname());
		System.out.println(emp2.getEname());
		System.out.println("After");
		td.commit();
		nf.close();

		// update(),saveOrupdate(),merge() for update the data
		Session s1 = sf.openSession();
		Transaction t1 = s1.beginTransaction();
		Employee e3 = s1.get(Employee.class, 1);
		t1.commit();
		s1.close();
		// detached state
		e3.setEname("bbkwinu");
		Session newSession = sf.openSession();
		Employee e4 = newSession.get(Employee.class, 1);

		Transaction rr = newSession.beginTransaction();
		newSession.merge(e3);
		// s1.update(e3);
		// s1.saveOrUpdate(e3);

		rr.commit();
		newSession.close();
		sf.close();

	}

}
