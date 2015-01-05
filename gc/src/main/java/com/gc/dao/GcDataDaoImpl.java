package com.gc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gc.entity.GcData;
import com.gc.entity.PersonEntity;

@Repository
public class GcDataDaoImpl implements GcDataDAO{

	@Autowired
    private SessionFactory sessionFactory;
	
	
	@Override
	public void addGcData(GcData gcdata) {
		this.sessionFactory.getCurrentSession().save(gcdata);
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<GcData> getGcData() {
		return this.sessionFactory.getCurrentSession().createQuery("from GcData").list();
	}

	@Override
	public void deleteGcData(Integer gcDataId) {
		GcData gcData = (GcData) sessionFactory.getCurrentSession().load(
				PersonEntity.class, gcDataId);
        if (null != gcData) {
        	this.sessionFactory.getCurrentSession().delete(gcData);
        }
		
	}
	@Override
	public GcData get(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
