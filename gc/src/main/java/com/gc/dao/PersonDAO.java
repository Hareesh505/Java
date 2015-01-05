package com.gc.dao;

import java.util.List;
import com.gc.entity.PersonEntity;

public interface PersonDAO 
{
    public void addPerson(PersonEntity person);
    public List<PersonEntity> getAllPersons();
    public void deletePerson(Integer personId);
    public PersonEntity getPerson(Integer personId);
}