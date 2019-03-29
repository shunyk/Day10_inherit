package com.shunyk.himart;

public class HimartView {
	public void view(product p) {
		System.out.println(p.getBrand());
		System.out.println(p.getColor());
		System.out.println(p.getPrice());
		System.out.println(p.getPoint());
		
		if(p instanceof Computer) {
			Computer c = (Computer)p;
			System.out.println(c.getCpu());
			System.out.println(c.getGb());
		}else if(p instanceof Tv) {
			Tv tv = (Tv)p;
			System.out.println(tv.getInch());
		}else {
			Handphone hp = (Handphone)p;
			System.out.println(hp.getInch());
			System.out.println(hp.getModel());
		}
	}
}
