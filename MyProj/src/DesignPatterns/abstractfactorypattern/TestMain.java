/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package DesignPatterns.abstractfactorypattern;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class TestMain {

    public static void main(String[] args) {
        FactoryProducer fp = new FactoryProducer();

        AbstractFactory shapeFactory = fp.getFactory("shape");
        shapeFactory.getShape("circle").draw();

        AbstractFactory colorFactory = fp.getFactory("color");
        colorFactory.getColor("red").fill();

    }
}
