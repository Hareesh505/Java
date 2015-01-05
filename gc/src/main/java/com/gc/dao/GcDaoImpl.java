package com.gc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gc.entity.PersonEntity;

@Repository
public class GcDaoImpl implements GcDAO{
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void add(Map<String, Object> addMap) {
		System.out.println("hello not here service impli");
		this.sessionFactory.getCurrentSession().save(addMap.get("entity"));
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> getAll(String entityName) {
		Map<String,Object> result = new HashMap<String, Object>();
		result.put("entity", this.sessionFactory.getCurrentSession().createQuery("from "+entityName).list());
		return result;
	}

	@Override
	public void delete(Map<String, Object> addMap) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> get(Map<String,Object> addMap) {
		Map<String,Object> result = new HashMap<String, Object>();
		Query q = sessionFactory.getCurrentSession().createQuery("from "+addMap.get("entity")+" as p where p."+addMap.get("idName")+" = :personId");
		q.setInteger("personId", (Integer)addMap.get("id"));
		Object person = (Object) q.list().get(0);
        if (null != person) {
        	result.put("entity",person);
        	return result;
        }
		return null;
	}
	

	

}
