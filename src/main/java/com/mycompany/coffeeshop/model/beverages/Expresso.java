/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages;

/**
 * @author colin
 */
public class Expresso extends AbstractBeverage {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 2.50;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Expresso";
    }

}
