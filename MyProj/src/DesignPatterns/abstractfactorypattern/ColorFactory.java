/*
 * Copyright (c) 2014 ChargeBee Inc
 * All Rights Reserved.
 */
package DesignPatterns.abstractfactorypattern;

/**
 *
 * @author Vaibhav <vaibhav@chargebee.com>
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("black")) {
            return new Black();
        } else if (color.equalsIgnoreCase("red")) {
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
