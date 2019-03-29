package com.shunyk.himart;

public class Customer {

	private int price;
	private int point;
	
	public Customer() {
		this.price=1000;
		this.point=0;
	}
	
	public void buy(product p) {
		this.price -= p.getPrice();
		this.point += p.getPoint();
		
		System.out.println("컴퓨터 가격" + p.getPrice());
		System.out.println("적립 포인트" + p.getPoint());
		System.out.println("고객의 잔액" + this.price);
		System.out.println("현재 포인트" + this.point); 
		
	}
	
}
