package com.rab3.repositories;

import java.util.List;

import org.hibernate.Query;
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

//	public AtntCustomersEntity getByCountry(String country) {
//
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//		Query q = session.createQuery("Select abc from AtntCustomersEntity abc where abc.country = :Country");
//
//		q.setParameter("Country", country);
//
//		List<AtntCustomersEntity> customers = q.list();
//
//		session.getTransaction().commit();
//		session.close();
//
//		if (customers.size() > 0) {
//			return customers.get(0);
//		}
//		return null;
//
//	}
	
	public List<AtntCustomersEntity> getByCountry(String country) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("From AtntCustomersEntity xyz where xyz.country = :Country");
		query.setParameter("Country", country);
		
		List<AtntCustomersEntity> customer = query.list();
		
		session.getTransaction().commit();
		session.close();
		
		return customer; 
	}

	public AtntCustomersEntity getById(int id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		AtntCustomersEntity ate = (AtntCustomersEntity) session.get(AtntCustomersEntity.class, id);
		session.getTransaction().commit();
		session.close();

		return ate;
	}

	public void update(AtntCustomersEntity atntcustomers) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.update(atntcustomers);
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
