/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.extras;

import com.mycompany.coffeeshop.model.beverages.Beverage;

/**
 * @author colin
 */
public class WhipCream extends BeverageExtras {

    /**
     * Constructor
     *
     * @param beverage
     */
    public WhipCream(Beverage beverage) {
        super(beverage);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return super.cost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return super.description() + ", with Whipped Cream";
    }

}
