/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package DesignPatterns.factotypattern;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class TestMain {

    public static void main(String[] args) {
        ShapeFactory.getShape("circle").draw();
        ShapeFactory.getShape("rectangle").draw();
        ShapeFactory.getShape("square").draw();
    }
}
