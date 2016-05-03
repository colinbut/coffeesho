/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model;

/**
 * A Latte
 *
 * @author colin
 */
public class Latte extends AbstractBeverage {


    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 2.30;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Latte";
    }

}
