package com.shunyk.zoo;

public class Tazo extends Birds{//상속
	
	private int egg;
	
	public int getEgg() {
		return egg;
	}

	public void setEgg(int egg) {
		this.egg = egg;
	}

	public Tazo() {
		super();
		
		
	}
	
	public Tazo(int egg) {
		this.egg = egg;
		this.getAge();
		super.getAge();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}
