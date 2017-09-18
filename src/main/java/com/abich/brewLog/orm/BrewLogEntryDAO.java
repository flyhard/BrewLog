package com.abich.brewLog.orm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BrewLogEntryDAO {
	private final SessionFactory sessionFactory;

	@Autowired
	public BrewLogEntryDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addLog(BrewLog log) {
		getCurrentSession().save(log);
	}

	@SuppressWarnings("unchecked")
	public List<BrewLog> listLogs() {
		return getCurrentSession().createQuery("from BrewLog").list();
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
