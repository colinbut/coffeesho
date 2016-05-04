/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.extras;

import com.mycompany.coffeeshop.model.beverages.Beverage;

/**
 * Representation for Extras for adding on to a Beverage
 *
 * This is a decorator
 *
 * @author colin
 */
public abstract class BeverageExtras implements Beverage {

    // decorated component
    protected final Beverage beverage;

    /**
     * Constructor
     *
     * @param beverage
     */
    protected BeverageExtras(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return beverage.cost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return beverage.description();
    }
}
