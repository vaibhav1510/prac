/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.static_prints;

/**
 *
 * @author vaibhav
 */
public class B extends A {

    static {
        System.out.println("Child Static");
    }

    {
        System.out.println("Child Instance");
    }

    public B() {
        System.out.println("Child Constructor");
    }
}
