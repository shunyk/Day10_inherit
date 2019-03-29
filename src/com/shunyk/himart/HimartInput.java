package com.shunyk.himart;

import java.util.Scanner;

public class HimartInput {
	Scanner sc;
	
	public HimartInput() {
		sc = new Scanner(System.in);
	}
	
	public void input(Tv tv) {
		tv.setBrand(sc.next());
		tv.setColor(sc.next());
		tv.setInch(sc.nextInt());
		tv.setPrice(sc.nextInt());
		tv.setPoint(sc.nextInt());
	}
	public void input(Computer com) {
		com.setBrand(sc.next());
		com.setColor(sc.next());
		com.setCpu(sc.next());
		com.setGb(sc.nextInt());
		com.setPrice(sc.nextInt());
		com.setPoint(sc.nextInt());
	}
	public void input(Handphone hp) {
		hp.setBrand(sc.next());
		hp.setColor(sc.next());
		hp.setInch(sc.nextInt());
		hp.setModel(sc.next());
		hp.setPrice(sc.nextInt());
		hp.setPoint(sc.nextInt());
	}
	
}
