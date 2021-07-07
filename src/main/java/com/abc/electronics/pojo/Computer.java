package com.abc.electronics.pojo;

public class Computer extends Electronics {

	
	private String processor;
	private String memory;
	
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	
	@Override
	public void display() {
		System.out.println("Check for Computer display unit");
	}
}
