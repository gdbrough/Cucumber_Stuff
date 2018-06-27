package com.training;

import org.springframework.stereotype.Component;

@Component
public class Wrench implements Tool {

	int size;
	
	public Wrench() {
		setSize(100);
	}
	
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
