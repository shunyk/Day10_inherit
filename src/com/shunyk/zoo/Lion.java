package com.shunyk.zoo;

public class Lion extends Animal {
	private int tooth;
	
	public Lion() {
		super();
	}
	
	public int getTooth() {
		return tooth;
	}

	public void setTooth(int tooth) {
		this.tooth = tooth;
	}
	
	public void eat() {
		//오버라이딩
		System.out.println("찹찹찹");
	}

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
	}
	
}
