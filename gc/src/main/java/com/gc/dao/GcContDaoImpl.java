package com.gc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gc.entity.GcContact;
import com.gc.entity.PersonEntity;

@Repository
public class GcContDaoImpl implements GcContDAO{
	
	@Autowired
    private SessionFactory sessionFactory;
	
	

	@Override
	public void addGcCont(GcContact gcCont) {
		this.sessionFactory.getCurrentSession().save(gcCont);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<GcContact> getGcContact() {
		return this.sessionFactory.getCurrentSession().createQuery("from GcContact").list();
	}

	@Override
	public void deleteGcContact(Integer gcContId) {
		GcContact gcCont = (GcContact) sessionFactory.getCurrentSession().load(
				PersonEntity.class, gcContId);
        if (null != gcCont) {
        	this.sessionFactory.getCurrentSession().delete(gcCont);
        }	
	}

}
