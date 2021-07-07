package com.abc.electronics.pojo;

public enum PromotionType {

	BOGO ("Buy one get one free"), BTGO (" value"), 
	REDUCED (" some value"), FREEITEM ("some value");
	
	public final String value;
	
	private PromotionType(String value){
		this.value = value;
	}
}
