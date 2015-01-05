package com.gc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gc.dao.PersonDAO;
import com.gc.entity.PersonEntity;

@Service
public class PersonManagerImpl implements PersonManager {
	
	@Autowired
    private PersonDAO personDAO;

	@Override
	@Transactional
	public void addPerson(PersonEntity employee) {
		personDAO.addPerson(employee);
	}

	@Override
	@Transactional
	public List<PersonEntity> getAllPerson() {
		return personDAO.getAllPersons();
	}

	@Override
	@Transactional
	public void deletePerson(Integer personId) {
		personDAO.deletePerson(personId);
	}

	public void setEmployeeDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	@Transactional
	public PersonEntity getPerson(Integer personId) {
		// TODO Auto-generated method stub
		return personDAO.getPerson(personId);
	}
}
