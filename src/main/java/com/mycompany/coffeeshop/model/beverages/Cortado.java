/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages;

/**
 * A Cortado
 *
 * @author colin
 */
public class Cortado extends AbstractBeverage {


    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 2.45;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return "Cortado";
    }
}
