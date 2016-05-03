/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages;

/**
 * A Macchiatto
 *
 * @author colin
 */
public class Macchiatto extends AbstractBeverage {

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
        return "Macchiatto";
    }

}
