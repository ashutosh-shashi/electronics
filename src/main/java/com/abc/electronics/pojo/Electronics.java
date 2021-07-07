package com.abc.electronics.pojo;

public abstract class Electronics implements Product{
	
	private Boolean isOpenBox;
	
	public void setOpenBox(Boolean isOpenBox) {
		this.isOpenBox = isOpenBox;
	}
	
	public Boolean checkBoxCondition() {
		
		if(isOpenBox) {
			
			System.out.println("This is open box item");
			
		}else {
			
			System.out.println("This is not an open box item");
		}
		return this.isOpenBox;
	}
	
	public abstract void display();

	@Override
	public void productInfo() {
		System.out.println("In electronics");
		
	}

	public void add(int x, int y) {
		int sum = x+y;
		System.out.println("in add method with 2 int arguments, sum is: "+sum);
	}
	
	public void add(int x, int y, int k) {
		int sum = x+y+k;
		System.out.println("in add method with 3 int arguments, sum is: "+sum);
	}
	
	public void add(String x, String y) {
		String sum = x+y;
		System.out.println("in add method with 2 String arguments, sum is: "+sum);
	}
}
