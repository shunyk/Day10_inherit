package com.shunyk.zoo;

public class Lion extends Animal {
	private int tooth;
	
	public int getTooth() {
		return tooth;
	}

	public void setTooth(int tooth) {
		this.tooth = tooth;
	}

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.sleep();
	}
	
}
