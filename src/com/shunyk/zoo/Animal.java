package com.shunyk.zoo;

public class Animal {
	//공통적인 요소
	private String color;
	private double ki;
	private double muge;
	private int age;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public double getMuge() {
		return muge;
	}

	public void setMuge(double muge) {
		this.muge = muge;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sleep() {
		System.out.println("Sleep");
		
	}
}
