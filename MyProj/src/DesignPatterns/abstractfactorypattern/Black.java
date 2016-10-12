/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package DesignPatterns.abstractfactorypattern;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class Black implements Color {

    @Override
    public void fill() {
        System.out.println(this.getClass().getName());
    }
}
