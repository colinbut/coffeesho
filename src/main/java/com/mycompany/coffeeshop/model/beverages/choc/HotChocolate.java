/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages.choc;

import com.mycompany.coffeeshop.model.beverages.AbstractBeverage;

/**
 * A delicious cup of Hot Chocolate
 *
 * @author colin
 */
public class HotChocolate extends AbstractBeverage {


    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 2.00;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Hot Chocolate";
    }
}
