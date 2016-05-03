/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages;

/**
 * A Flat White
 *
 * @author colin
 */
public class FlatWhite extends AbstractBeverage {

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
        return "Flat White";
    }
}
