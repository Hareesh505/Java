package com.gc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gc.entity.GcTemplate;
import com.gc.entity.PersonEntity;
@Repository
public class GcTempDaoImpl implements GcTempDAO{

	@Autowired
    private SessionFactory sessionFactory;
	
	
	@Override
	public void addGcTemp(GcTemplate gcTemp) {
		this.sessionFactory.getCurrentSession().save(gcTemp);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<GcTemplate> getGcTemp() {
		return this.sessionFactory.getCurrentSession().createQuery("from GcTemplate").list();
	}

	@Override
	public void deleteGcTemp(Integer gcTempId) {
		GcTemplate gcTemp = (GcTemplate) sessionFactory.getCurrentSession().load(
				PersonEntity.class, gcTempId);
        if (null != gcTemp) {
        	this.sessionFactory.getCurrentSession().delete(gcTemp);
        }		
	}

	@Override
	public GcTemplate get(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
