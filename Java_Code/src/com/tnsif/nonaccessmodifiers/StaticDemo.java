package com.tnsif.nonaccessmodifiers;

public class StaticDemo {
	//Static variable
	static int count;
	//Static block
	static {
		count=20;
		System.out.println("Shows the static count assigned:"+count);
	}
	//Static method
	static void show() {
		System.out.println("Method runs in static with count of:"+count);
	}

	public static void main(String[] args) {
		System.out.println("static in main method:"+count);
		show(); //calling the method
	}

}
