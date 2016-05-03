/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.extras;

import com.mycompany.coffeeshop.model.Beverage;

/**
 * Chocolate Sprinkle
 *
 * @author colin
 */
public class ChocolateSprinkleBeverage extends BeverageExtras {


    /**
     * Constructor
     *
     * @param beverage
     */
    protected ChocolateSprinkleBeverage(Beverage beverage) {
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
        return super.description() + ", with Chocolate Sprinkles";
    }

}
