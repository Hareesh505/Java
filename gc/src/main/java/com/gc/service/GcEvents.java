package com.gc.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gc.entity.GcTemplate;

@Service
public class GcEvents implements GcEventInterface{
	@Autowired
    private SessionFactory sessionFactory;
	
	@Transactional
	public Map<String,String> getTemplateParents(){
		Query q = sessionFactory.getCurrentSession().createQuery("from GcTemplate as t where t.isParent = :isParent");
		q.setString("isParent", "Y");
		List<GcTemplate> person = q.list();
		Map<String,String> tempParent=new HashMap<String, String>();
        if (null != person) {
        	System.out.println("person"+person.toString());
        	for (GcTemplate gcTemplate : person) {
				tempParent.put(""+gcTemplate.getGcTempId(), ""+gcTemplate.getGcTempName());
			}
        	return tempParent;
        }
		return null;
	}
}
