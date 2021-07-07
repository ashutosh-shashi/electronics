package com.abc.electronics.pojo;

public class GMTest {

	public static <T> void gmethod(T element) {
		System.out.println(element.getClass().getTypeName()+" value is: "+element);
	}
}
