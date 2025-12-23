package com.tnsif.multipleinheritance;

//Two interface class
interface Walkable {
	void walk();	
}
interface Swimable {
	void swim();
}

// implement the above 2 interface to another class
class Human implements Walkable,Swimable{
	@Override
	public void walk() {
		System.out.println("she is Walking");
	}
	@Override
	public void swim() {
		System.out.println("She is Swimming");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.swim();
		obj.walk();
	}

}
