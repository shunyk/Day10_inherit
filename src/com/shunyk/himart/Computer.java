package com.shunyk.himart;

public class Computer extends product{
	
	private int gb;
	private String cpu;
	
	public int getGb() {
		return gb;
	}
	public void setGb(int gb) {
		this.gb = gb;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
	public Computer() {
		this.setBrand("LG");
		this.setColor("white");
		this.gb=128;
		this.cpu="i3-7100U";
		this.setPrice(80);
		this.setPoint(100);
	}
	
}
