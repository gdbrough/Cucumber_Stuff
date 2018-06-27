package com.training;

public class Plumber {

	Hammer hammer;
	Wrench wrench;
	String name;
	
	public Plumber(String name, Hammer hammer) {
		this.name = name;
		this.hammer = hammer;
	}
	
	public Wrench getWrench() {
		return wrench;
	}
	
	public void setWrench(Wrench wrench) {
		this.wrench = wrench;
	}
	
	public Hammer getHammer() {
		return hammer;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHammer(Hammer hammer) {
		this.hammer = hammer;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Plumber [hammer=" + hammer + "]";
	}
}
