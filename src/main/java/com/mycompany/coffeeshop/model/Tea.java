/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model;

/**
 * Abstraction for Tea
 *
 * @author colin
 */
public abstract class Tea implements Beverage {

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
        return "Tea";
    }



}
