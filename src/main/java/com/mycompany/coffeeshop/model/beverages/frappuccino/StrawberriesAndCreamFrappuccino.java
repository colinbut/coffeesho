/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages.frappuccino;


/**
 * Strawberries and Cream
 *
 * This is a classic
 *
 * @author colin
 */
public class StrawberriesAndCreamFrappuccino extends Frappuccino {


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
        return "Strawberries and Cream";
    }

}
