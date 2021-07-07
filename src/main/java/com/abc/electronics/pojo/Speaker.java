package com.abc.electronics.pojo;

public class Speaker extends Electronics{

	private Integer noOfChannels;
	private Integer sizeInInch;
	
	public Integer getNoOfChannels() {
		return noOfChannels;
	}
	public void setNoOfChannels(Integer noOfChannels) {
		this.noOfChannels = noOfChannels;
	}
	public Integer getSizeInInch() {
		return sizeInInch;
	}
	public void setSizeInInch(Integer sizeInInch) {
		this.sizeInInch = sizeInInch;
	}
	
	@Override
	public void productInfo() {
		System.out.println("In electronics - Speaker Section");
		
	}
	@Override
	public void display() {
		System.out.println("Implemented in Speaker");
		
	}
	
	@Override
	public void productQuality() {
		System.out.println("Speaker quality is excellent");
	}
	
}
