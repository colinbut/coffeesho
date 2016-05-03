/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.extras;

import com.mycompany.coffeeshop.model.beverages.Beverage;

/**
 * Milk
 *
 * @author colin
 */
public class Milk extends BeverageExtras {

    /**
     * Constructor
     *
     * @param beverage
     */
    public Milk(Beverage beverage) {
        super(beverage);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return super.cost() + 0.50; // 50P for milk? WTF!
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return super.description() + ", with Milk";
    }


}
