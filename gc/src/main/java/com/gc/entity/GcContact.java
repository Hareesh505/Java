package com.gc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity (name = "GcContact")
@Table(name="GCCONTACT")
public class GcContact {
	@Id
    @GeneratedValue
	private int gcContactId;
	
	private int personId;
	
	private String email;
    
    private String telephone;
    
    private String address;

	public int getGcContactId() {
		return gcContactId;
	}

	public void setGcContactId(int gcContactId) {
		this.gcContactId = gcContactId;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    

}
