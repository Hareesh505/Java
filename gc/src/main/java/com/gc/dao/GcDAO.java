package com.gc.dao;

import java.util.List;
import java.util.Map;


public interface GcDAO {
	public void add(Map<String,Object> addMap);
    public Map<String,Object> getAll(String entityName);
    public void delete(Map<String,Object> addMap);
    public  Map<String, Object> get(Map<String,Object> addMap);
}
