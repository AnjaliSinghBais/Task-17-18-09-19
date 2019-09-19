package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookDao {

	//ADDING NEW BOOK TO DATABASE
	public static String saveBook(Books book) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(book);
		tr.commit();
		session.close();
		return "saved";
	}

	//REMOVING A BOOK FROM DATABASE
	public static String removeBook(Books book) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(book);
		tr.commit();
		session.close();
		return "saved";
	}

	// UPDATING BOOK DETAILS
	public static String updateBook(Books book) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		book.setBname(book.getBname());
		book.setPrice(book.getPrice());
		session.update(book);
		tr.commit();
		session.close();
		return "saved";
	}

	public static String showBook(Books book) {
		Configuration config = new Configuration().configure();
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.delete(book);
		tr.commit();
		session.close();
		return "saved";
	}
}
