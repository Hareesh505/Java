package com.gc.dao;

import java.util.List;

import com.gc.entity.GcContact;

public interface GcContDAO {

	public void addGcCont(GcContact gcCont);
    public List<GcContact> getGcContact();
    public void deleteGcContact(Integer gcContId);
}
