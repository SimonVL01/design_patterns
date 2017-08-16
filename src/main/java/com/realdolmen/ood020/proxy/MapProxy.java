package com.realdolmen.ood020.proxy;

import java.io.IOException;
import java.util.HashMap;

public class MapProxy implements AbstractMap {

	private String fileName;
	private HashMap<String, String> cache = new HashMap<String, String>();
	private Map map;

	public MapProxy(String fileName) {
		this.fileName = fileName;
	}

	private Map getMap() {
		if(map == null)
			map = new Map (fileName);
		return map;
	}

	public String find(String key) throws Exception {
		if (cache.containsKey(key)) {
				return cache.get(key);
		} else {

			String value = getMap().find(key);
			cache.put(key, value);
			return value;
		}
	}

	public void add(String key, String value) throws Exception {
		cache.put(key, value);
		getMap().add(key, value);
	}

	private String get(String key) { return (String) cache.get(key); }

	private void put(String key, String value) {
		cache.put(key, value);
	}
}
