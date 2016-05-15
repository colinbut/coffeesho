/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages.coffee;

import com.mycompany.coffeeshop.model.beverages.AbstractBeverage;

/**
 * Mocha
 *
 * @author colin
 */
public class Mocha extends AbstractBeverage {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 3.50;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Mocha";
    }

}
