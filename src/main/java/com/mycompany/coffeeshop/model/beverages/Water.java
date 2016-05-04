/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coffeeshop.model.beverages;

/**
 * Water - just plain tap water
 *
 * @author colin
 */
public class Water extends AbstractBeverage {

    /**
     * {@inheritDoc}
     */
    @Override
    public double cost() {
        return 0.0;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String description(){
        return "Water";
    }

}
