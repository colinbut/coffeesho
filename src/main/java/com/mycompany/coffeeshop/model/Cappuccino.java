/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model;

/**
 * A Cappuccino
 *
 * @author colin
 */
public class Cappuccino extends AbstractBeverage {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 2.35;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Cappuccino";
    }
}
