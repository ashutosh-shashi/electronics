package com.abc.electronics.pojo;

@FunctionalInterface
public interface Promotions {

	public static final String BOGO="Bye One Get One Free";
	public static final String BTGO="Bye Two Get One Free";
	public static final String FREE_ITEM="Bye One CellPhone Get a headphone Free";
	
	public int calculateSaving(int price, int discount);
	
}
