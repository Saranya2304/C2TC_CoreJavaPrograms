package com.tnsif.change.code;

class A3 {
    void display() {
        System.out.println("A display");
    }
}

class B3 extends A3 {
	void show() {
        System.out.println("B display");
	}

	public static void main(String[] arg ) {
    	B3 obj=new B3();
    	obj.display();
    	obj.show();
    }
}
