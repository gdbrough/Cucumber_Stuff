package com.training.plumber;

public class Plumber {

	Tool tool;
	String name;
	
	public Plumber(String name, Tool tool) {
		this.name = name;
		this.tool = tool;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Tool getTool() {
		return tool;
	}
	
	public void setTool(Tool tool) {
		this.tool = tool;
	}

	@Override
	public String toString() {
		return "Plumber [tool=" + tool + ", name=" + name + "]";
	}
}
