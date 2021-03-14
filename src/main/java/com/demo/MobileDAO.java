package com.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MobileDAO {
	
	// defined in dispatcher
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Mobile> getMobile(){
		Session session = sessionFactory.getCurrentSession();
		List<Mobile> mobiles = session.createQuery("from Mobile", Mobile.class).list();
		return mobiles;
	}
	
	@Transactional
	public void addMobile(Mobile m) {
		Session session = sessionFactory.getCurrentSession();
		session.save(m);
	}
	
	@Transactional
	public Mobile getMobile(int mid) {
		Session session = sessionFactory.getCurrentSession();
		Mobile m = session.get(Mobile.class, mid);
		return m;
	}

}
