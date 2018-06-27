package com.training;

public class Wrench implements Tool {

	int size;
	
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
