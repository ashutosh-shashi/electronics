package com.abc.electronics.pojo;

public class CellPhone extends Electronics{

	private String size;
	private String memory;
	private Integer batteryLifeHours;
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public Integer getBatteryLifeHours() {
		return batteryLifeHours;
	}
	public void setBatteryLifeHours(Integer batteryLifeHours) {
		this.batteryLifeHours = batteryLifeHours;
	}
	
	public void display() {
		System.out.println("Check for CellPhone display unit");
	}
	
}
