package com.abc.electronics.pojo;

public class GenClass <T, U> {

	private T t;
	private U u;
	
	public GenClass(T t, U u){
		this.t = t;
		this.u = u;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public U getU() {
		return u;
	}

	public void setU(U u) {
		this.u = u;
	}
	
	public void printGeneric() {
		System.out.println();
	}
}
