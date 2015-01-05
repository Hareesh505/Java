package com.gc.dao;

import java.util.List;

import com.gc.entity.GcData;

public interface GcDataDAO {

	public void addGcData(GcData gcdata);
    public List<GcData> getGcData();
    public void deleteGcData(Integer gcDataId);
    public GcData get(Integer Id);
}
