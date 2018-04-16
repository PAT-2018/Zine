package com.zine.models;

import java.util.Map;

public class MenuItem {
	private int id;
	private String name;
	private String description;
	private Map<String,Integer> prices;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Map<String, Integer> getPrices() {
		return prices;
	}
	
	public void setPrices(Map<String, Integer> prices) {
		this.prices = prices;
	}
}
