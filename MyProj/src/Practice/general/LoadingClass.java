/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Practice.general;

/**
 *
 * @author vaibhav
 */
public class LoadingClass {

    static String s1 = init("static");

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    private static String init(String s) {
        System.out.println("init " + s + " variable");
        return s;
    }
    String s2 = init("instance");

    public LoadingClass() {
        System.out.println("constructor");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method called");
    }

    public static void main(String[] args) {
        LoadingClass ld = new LoadingClass();
    }
}
