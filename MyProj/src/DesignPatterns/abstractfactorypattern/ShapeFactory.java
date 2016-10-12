/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package DesignPatterns.abstractfactorypattern;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
