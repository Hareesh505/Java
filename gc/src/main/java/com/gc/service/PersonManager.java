package com.gc.service;

import java.util.List;

import com.gc.entity.PersonEntity;

public interface PersonManager {
	public void addPerson(PersonEntity person);
    public List<PersonEntity> getAllPerson();
    public void deletePerson(Integer personId);
    public PersonEntity getPerson(Integer personId);
}
