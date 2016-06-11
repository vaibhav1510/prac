/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package DesignPatterns.abstractfactorypattern;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println(this.getClass().getName());
    }
}
