package com.gc.service;

import java.util.Map;

public interface GcService {
	public void add(Map<String,Object> addMap);
    public Map<String,Object> getAll(String entityName);
    public void delete(Map<String,Object> addMap);
    public  Map<String, Object> get(Map<String,Object> addMap);
}
