/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.static_prints;

/**
 *
 * @author vaibhav
 */
public class A {

    static {
        System.out.println("Super Static");
    }

    {
        System.out.println("Super Instance");
    }

    public A() {
        System.out.println("Super Constructor");
    }
}
