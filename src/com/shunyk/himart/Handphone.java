package com.shunyk.himart;

public class Handphone extends product{
	
	private int inch;
	private String model;
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Handphone() {
		this.setBrand("SAMSUNG");
		this.setColor("BLUE");
		this.setPrice(70);
		this.setPoint(100);
		this.inch=5;
		this.model="S10";
	}	
	
}
