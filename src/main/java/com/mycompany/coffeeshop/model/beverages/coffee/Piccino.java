/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages.coffee;

import com.mycompany.coffeeshop.model.beverages.AbstractBeverage;

/**
 * A Piccino
 *
 * @author colin
 */
public class Piccino extends AbstractBeverage {


    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 4.50;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Piccino";
    }

}
