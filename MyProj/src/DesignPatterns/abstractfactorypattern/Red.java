/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package DesignPatterns.abstractfactorypattern;

import java.sql.Timestamp;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println(this.getClass().getName());
    }
}
