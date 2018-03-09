package com.mercedes.tesDrive.dto;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Availability {

	HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

	public HashMap<String, ArrayList<String>> getMap() {
		return map;
	}

	public void setMap(HashMap<String,  ArrayList<String>> map) {
		this.map = map;
	}
	
	public void setMap(String key,  ArrayList<String> _map ) {
		((Map<String, ArrayList<String>>) map).put(key,_map);
	}
}
