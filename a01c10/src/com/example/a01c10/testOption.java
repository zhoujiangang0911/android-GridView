package com.example.a01c10;

import java.io.Serializable;

public class testOption implements Serializable{
	private int icon;
	private String name;
	
	public testOption(){}
	
	public testOption(int icon, String name) {
		this.icon = icon;
		this.name = name;
	}
	public int getIcon() {
		return icon;
	}
	public void setIcon(int icon) {
		this.icon = icon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
