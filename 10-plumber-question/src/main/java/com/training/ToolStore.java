package com.training;

public class ToolStore {
	
	String name = "Generic Tool Store";
	
	public Hammer makeHammer() {
		return new Hammer();
	}
	
	public Wrench makeWrench() {
		return new Wrench();
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ToolStore [name=" + name + "]";
	}
	
	
}