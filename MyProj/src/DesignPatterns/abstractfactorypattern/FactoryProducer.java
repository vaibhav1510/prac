/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package DesignPatterns.abstractfactorypattern;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (type.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
