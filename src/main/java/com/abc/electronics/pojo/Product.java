package com.abc.electronics.pojo;

public interface Product {

	public void productInfo();
	
	public default void productQuality() {
		System.out.println("Product quality is excellent");
	}
}
