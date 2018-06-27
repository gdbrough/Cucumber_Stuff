package com.training;

public class BuildHelper {
	Tool tool;
	Plumber plumber;
 
	//DI via constructor
	public BuildHelper(ToolStore store, Plumber plumber){
		Tool wrench = store.makeWrench();
		wrench.setSize(20);
		this.tool = wrench;
		this.plumber = plumber;
	}
	
	public Plumber getPlumber() {
		return plumber;
	}
	
	public Tool getTool() {
		return tool;
	}
}