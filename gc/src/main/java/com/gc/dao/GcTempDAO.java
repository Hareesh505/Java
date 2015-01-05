package com.gc.dao;

import java.util.List;

import com.gc.entity.GcTemplate;

public interface GcTempDAO {
	public void addGcTemp(GcTemplate gcTemp);
    public List<GcTemplate> getGcTemp();
    public void deleteGcTemp(Integer gcTempId);
    public GcTemplate get(Integer Id);
}
