package com.demo.test;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.demo.model.Product;

public class TestCriteriaQuery {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction td = session.beginTransaction();
		Criteria cr = session.createCriteria(Product.class);
		List<Product> lt = cr.list();
		lt.forEach(System.out::println);
		Criterion pricegt = Restrictions.gt("price", 300.00);
		Criterion pricelt = Restrictions.lt("qty", 50);
		Criteria cr1 = session.createCriteria(Product.class);
		LogicalExpression ex1 = Restrictions.and(pricegt, pricelt);
		cr1.add(ex1);
		List<Product> l1 = cr1.list();
		l1.forEach(System.out::println);

		cr.setFirstResult(1);
		cr.setMaxResults(2);
		l1 = cr.list();
		l1.forEach(System.out::println);

		// ------------------------------JPQL
		System.err.println("JPQL");
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cr2 = cb.createQuery(Product.class);
		Root<Product> rt = cr2.from(Product.class);
		Query q = session.createQuery(cr2.select(rt));
		l1 = q.getResultList();
		l1.forEach(System.out::println);
		td.commit();
		session.close();
		sf.close();
	}
}