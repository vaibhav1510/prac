/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice;

/**
 *
 * @author vaibhav
 */
public class TestM {

    public static void main(String[] args) {
        System.out.println(new A().fun(50));
    }

}

class A {

    int fun(int n) {
        int res;
        if (n == 1) {
            return 1;
        }
        res = fun(n - 1);
        return res;
    }

}

//class B extends A {
//
//    int j;
//
//    void display() {
//        super.j = 3;
//        System.out.println(i + " " + j);
//    }
//
//}
