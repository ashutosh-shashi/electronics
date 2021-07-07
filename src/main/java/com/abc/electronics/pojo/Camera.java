package com.abc.electronics.pojo;

public class Camera extends Electronics{

	private String megaPixel;

	public String getMegaPixel() {
		return megaPixel;
	}

	public void setMegaPixel(String megaPixel) {
		this.megaPixel = megaPixel;
	}
	
	public void display() {
		System.out.println("Check for Camera display unit");
	}
	
}
