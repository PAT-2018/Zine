package com.zine.models;

import java.util.Map;

public class Menu {
	private int id;
	private String name;
	private String description;
	private Map<MenuGroup,MenuItem> menuStructure;
	
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
	
	public Map<MenuGroup, MenuItem> getMenuStructure() {
		return menuStructure;
	}
	
	public void setMenuStructure(Map<MenuGroup, MenuItem> menuStructure) {
		this.menuStructure = menuStructure;
	}
}
