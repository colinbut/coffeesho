/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages;

/**
 * Abstraction for a Beverage
 *
 * @author colin
 */
public abstract class AbstractBeverage implements Beverage {


    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 0.0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Ingredients:";
    }
}
