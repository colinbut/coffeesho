/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages.coffee;

import com.mycompany.coffeeshop.model.beverages.AbstractBeverage;

/**
 * Typically a Expresso
 *
 * @author colin
 */
public class ExpressoConPanna extends AbstractBeverage {

    private final Expresso expresso;

    /**
     * Constructor
     *
     * @param expresso
     */
    public ExpressoConPanna(Expresso expresso) {
        this.expresso = expresso;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return expresso.cost() + 0.50;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description() {
        return expresso.cost() + " Con Panna";
    }

}
