package com.training.plumber.annot;

import org.springframework.stereotype.Component;

@Component
public class Hammer implements Tool {

	int size;
	
	public Hammer() { }
	
	@Override
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {
		return "Hammer [size=" + size + "]";
	}
}