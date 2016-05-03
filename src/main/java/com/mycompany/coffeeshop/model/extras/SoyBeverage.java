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
public class SoyBeverage extends BeverageExtras {

    /**
     *
     * @param beverage
     */
    public SoyBeverage(Beverage beverage) {
        super(beverage);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return super.cost() + 1.00; // Soy is much more expensive than just Milk!
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description(){
        return super.description() + ", with Soy Milk";
    }

}
