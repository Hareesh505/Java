package com.gc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "GcData")
@Table(name="GCDATA")
public class GcData {
	
	@Id
    @GeneratedValue
	private int gcDataId;
		
	private String gcDataFirstName;
	
	private String gcDataSecondNAme;
	
	private Date gcDataDate;
	
	private String gcDataVenue;
	
	private String gcDataParentsName1;
	
	private String  gcDataParentName2;
	
	private String createdBy;

	public int getGcDataId() {
		return gcDataId;
	}

	public void setGcDataId(int gcDataId) {
		this.gcDataId = gcDataId;
	}

	public String getGcDataFirstName() {
		return gcDataFirstName;
	}

	public void setGcDataFirstName(String gcDataFirstName) {
		this.gcDataFirstName = gcDataFirstName;
	}

	public String getGcDataSecondNAme() {
		return gcDataSecondNAme;
	}

	public void setGcDataSecondNAme(String gcDataSecondNAme) {
		this.gcDataSecondNAme = gcDataSecondNAme;
	}

	public Date getGcDataDate() {
		return gcDataDate;
	}

	public void setGcDataDate(Date gcDataDate) {
		this.gcDataDate = gcDataDate;
	}

	public String getGcDataVenue() {
		return gcDataVenue;
	}

	public void setGcDataVenue(String gcDataVenue) {
		this.gcDataVenue = gcDataVenue;
	}

	public String getGcDataParentsName1() {
		return gcDataParentsName1;
	}

	public void setGcDataParentsName1(String gcDataParentsName1) {
		this.gcDataParentsName1 = gcDataParentsName1;
	}

	public String getGcDataParentName2() {
		return gcDataParentName2;
	}

	public void setGcDataParentName2(String gcDataParentName2) {
		this.gcDataParentName2 = gcDataParentName2;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
}
