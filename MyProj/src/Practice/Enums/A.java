/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.Enums;

/**
 *
 * @author vaibhav
 */
public class A {

    public static void main(String[] args) {
        B b = new B();
        b.set(Test.A);
        b.set(Test.D);
        b.set(Test.C);
        b.set(Test.B);

    }
}

enum Test {

    A, B, C, D;
}

class B {

    String s;

    public void set(Enum e) {
        s = e.name();
        print();
    }

    private void print() {
        System.out.println("==>: " + s);
    }
}
