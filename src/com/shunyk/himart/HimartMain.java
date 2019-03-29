package com.shunyk.himart;

public class HimartMain {

	public static void main(String[] args) {
		Computer com = new Computer();
		Handphone hp = new Handphone();
		Tv tv = new Tv();
		HimartView hv = new HimartView();
		Customer cm = new Customer();

		hv.view(hp);

		cm.buy(com);

		product [] products = new product[3];
		products[0] = tv;
		products[1] = hp;
		products[2] =com; 		
	}

}
