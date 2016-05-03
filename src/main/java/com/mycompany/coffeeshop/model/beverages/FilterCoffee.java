/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages;

/**
 * A Filter coffee
 *
 * @author colin
 */
public class FilterCoffee extends AbstractBeverage {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 1.00;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Filter Coffee";
    }
}
