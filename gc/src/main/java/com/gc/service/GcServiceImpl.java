package com.gc.service;

import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gc.dao.GcDAO;
import com.gc.entity.PersonEntity;

@Service
public class GcServiceImpl implements GcService{
	
	@Autowired
    private GcDAO gcDao;
	@Autowired
    private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public GcDAO getGcDao() {
		return gcDao;
	}

	public void setGcDao(GcDAO gcDao) {
		this.gcDao = gcDao;
	}
	
	public void addPerson(PersonEntity person) {
		if(null != person.getPersonId()){
			this.sessionFactory.getCurrentSession().update(person);
		}
		else{
			this.sessionFactory.getCurrentSession().save(person);			
		}
	}

	@Override
	@Transactional
	public void add(Map<String, Object> addMap) {
		gcDao.add(addMap);
	}

	@Override
	@Transactional
	public Map<String, Object> getAll(String entityName) {
		return gcDao.getAll(entityName);
	}

	@Override
	@Transactional
	public void delete(Map<String, Object> addMap) {
		gcDao.delete(addMap);
		
	}

	@Override
	@Transactional
	public Map<String, Object> get(Map<String, Object> addMap) {		
		return gcDao.get(addMap);
	}
	
}
