package com.rab3.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rab3.entities.AtntCustomersEntity;

public class ProductRepository {

	private SessionFactory sessionFactory;

	public void sava(AtntCustomersEntity atnt) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(atnt);
		session.getTransaction().commit();
		session.close();

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
