package com.gc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gc.entity.PersonEntity;

@Repository
public class PersonDaoImpl implements PersonDAO  {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void addPerson(PersonEntity person) {
		if(null != person.getPersonId()){
			this.sessionFactory.getCurrentSession().update(person);
		}
		else{
			this.sessionFactory.getCurrentSession().save(person);			
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonEntity> getAllPersons() {
		return this.sessionFactory.getCurrentSession().createQuery("from Person").list();
	}

	@Override
	public void deletePerson(Integer personId) {
		PersonEntity person = (PersonEntity) sessionFactory.getCurrentSession().load(
				PersonEntity.class, personId);
        if (null != person) {
        	this.sessionFactory.getCurrentSession().delete(person);
        }
	}
	
	
	@Override
	public PersonEntity getPerson(Integer personId) {
		// TODO Auto-generated method stub
		Query q = sessionFactory.getCurrentSession().createQuery("from Person as p where p.personId = :personId");
		q.setInteger("personId", personId);
		PersonEntity person = (PersonEntity) q.list().get(0);
        if (null != person) {
        	return person;
        }
		return null;
	}
	
	

}
