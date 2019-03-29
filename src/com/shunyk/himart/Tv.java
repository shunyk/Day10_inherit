package com.shunyk.himart;

public class Tv extends product{
	private int inch;

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public Tv() {
		this.setBrand("LG");
		this.setColor("BLACK");
		this.setPrice(250);
		this.setPoint(300);
		this.inch = 55;

	}
	
}
