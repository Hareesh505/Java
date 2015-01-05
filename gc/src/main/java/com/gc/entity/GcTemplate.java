package com.gc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "GcTemplate")
@Table(name="GCTEMPLATE")
public class GcTemplate {
	
	@Id
    @GeneratedValue
	private int gcTempId;
	
	private String gcTempName;
	
	private String gcTempDesc;
	
	private String gcTempImgPath;
	
	private int gcTempParentId;
	
	private String isParent;

	public int getGcTempId() {
		return gcTempId;
	}

	public void setGcTempId(int gcTempId) {
		this.gcTempId = gcTempId;
	}

	public String getGcTempName() {
		return gcTempName;
	}

	public void setGcTempName(String gcTempName) {
		this.gcTempName = gcTempName;
	}

	public String getGcTempDesc() {
		return gcTempDesc;
	}

	public void setGcTempDesc(String gcTempDesc) {
		this.gcTempDesc = gcTempDesc;
	}

	public String getGcTempImgPath() {
		return gcTempImgPath;
	}

	public void setGcTempImgPath(String gcTempImgPath) {
		this.gcTempImgPath = gcTempImgPath;
	}

	public int getGcTempParentId() {
		return gcTempParentId;
	}

	public void setGcTempParentId(int gcTempParentId) {
		this.gcTempParentId = gcTempParentId;
	}

	public String getIsParent() {
		return isParent;
	}

	public void setIsParent(String isParent) {
		this.isParent = isParent;
	}
	
	
	

}
