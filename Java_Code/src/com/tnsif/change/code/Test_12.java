package com.tnsif.change.code;

class G1 {
    void show() {
        System.out.println("G1");
    }
}

class H1 extends G1{
    void show() {
        System.out.println("H1");
    }
}

public class Test_12 {
    public static void main(String[] args) {
        G1 a = new H1();   //Upcasting
        a.show();          //Method overriding
    }
}

