package com.tnsif.oops.inheritance;

class A{ //Superclass/parent
	void display() {
		System.out.println("Hello World");
	}
	
}
class B extends A{        //Subclass/child
	
}
class C extends A{
		
}

public class InheritanceDemo {

	public static void main(String[] args) {
		C obj=new C();
		obj.display();
	}

}
