package com.training.plumber.annot;

import org.springframework.stereotype.Component;

@Component
public class Wrench implements Tool {

	int size;
	
	public Wrench() { }
	
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
		return "Wrench [size=" + size + "]";
	}
}