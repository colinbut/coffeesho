/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages.coffee;

import com.mycompany.coffeeshop.model.beverages.AbstractBeverage;

/**
 * A Americano
 *
 * @author colin
 */
public class Americano extends AbstractBeverage {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 2.10;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Americano";
    }

}
