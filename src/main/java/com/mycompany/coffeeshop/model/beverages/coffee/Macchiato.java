/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages.coffee;

import com.mycompany.coffeeshop.model.beverages.AbstractBeverage;

/**
 * A Macchiato
 *
 * @author colin
 */
public class Macchiato extends AbstractBeverage {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 3.45;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Macchiato";
    }

}
