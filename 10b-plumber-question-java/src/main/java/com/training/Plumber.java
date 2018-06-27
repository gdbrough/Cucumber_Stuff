package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Plumber {

	@Autowired
	@Qualifier(value="wrench")
	Tool tool;
	String name;
	
	public Plumber() {
		// TODO Auto-generated constructor stub
	}
	
	public Plumber(String name) {
		this.name = name;
	}

	public Tool getTool() {
		return tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Plumber [tool=" + tool + ", name=" + name + "]";
	}
}
