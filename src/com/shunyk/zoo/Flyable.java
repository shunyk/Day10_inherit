package com.shunyk.zoo;

public interface Flyable {
	
	//접근지정자는 public static final
	//안쓰면 자동으로 만들어줌
	
	public static final int NUM = 10;
	int NUMBER = 20;
	
	//추상메소드
	//public abstract
	//안쓰면 자동으로 만들어줌
	public abstract void fly();

}
